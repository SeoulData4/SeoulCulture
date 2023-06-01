package com.squad.seoulculture.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squad.seoulculture.domain.SebcHistoricSiteKor;
import com.squad.seoulculture.domain.SebcHistoricSiteRow;
import com.squad.seoulculture.repository.SebcHistoricSiteRowRepository;
import com.squad.seoulculture.service.SebcHistoricSiteRowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class CultureController {

    private final SebcHistoricSiteRowService sebcHistoricSiteRowService;
    private final SebcHistoricSiteRowRepository sebcHistoricSiteRowRepository;

    @GetMapping("")
    public String index () {
        return "index";
    }

    @GetMapping("/cultural")
    public String cultural(Model model) throws JsonProcessingException {

        String url = "http://openapi.seoul.go.kr:8088/505463556d67686439324765754650/json/SebcHistoricSiteKor/1/1000/";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        if (response.getStatusCode() == HttpStatus.OK) {
            String responseBody = response.getBody();

            JsonNode root = objectMapper.readTree(responseBody);
            JsonNode sebcHistoricSiteKorNode = root.get("SebcHistoricSiteKor");

            SebcHistoricSiteKor sebcHistoricSiteKor = objectMapper.readValue(sebcHistoricSiteKorNode.toString(), SebcHistoricSiteKor.class);

            SebcHistoricSiteRow firstRow = sebcHistoricSiteKor.getRows().get(0);
            String mainKey = firstRow.getMainKey();
//            System.out.println("❌" + mainKey);
            model.addAttribute("sebcHistoricSiteKor", sebcHistoricSiteKor);
            System.out.println(root);
            System.out.println(sebcHistoricSiteKorNode.toString());
            System.out.println(sebcHistoricSiteKor);

            sebcHistoricSiteRowRepository.saveAll(sebcHistoricSiteKor.getRows());

//            SebcHistoricSiteRow rowToSave = sebcHistoricSiteKor.getRows().get(0);
//            String saveResult = sebcHistoricSiteRowService.saveHistoricList(rowToSave);
//            System.out.println(saveResult);
//            model.addAttribute("saveResult", saveResult); // 성공 메시지 추가
        } else {
            model.addAttribute("errorMessage", "오류가 발생했습니다.");
        }

        return "cultural/cultural_list";
    }
}
