package com.squad.seoulculture.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.squad.seoulculture.domain.*;
import com.squad.seoulculture.repository.CultureListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/culture")
public class CultureController {
    private final CultureListRepository cultureListRepository;

    @GetMapping("")
    public String index() {
        return "index";
    }
//    @GetMapping("/cultural")
//    public String cultural(){
//        return "cultural/cultural_list.html";
//    }
//}

//    @GetMapping("/cultural")
//    public String cultural(Model model) throws JsonProcessingException {
//
//            String url = "http://openapi.seoul.go.kr:8088/505463556d67686439324765754650/json/SebcHistoricSiteKor/1/1000/";
//
//            RestTemplate restTemplate = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            HttpEntity<String> entity = new HttpEntity<>(headers);
//
//            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            if (response.getStatusCode() == HttpStatus.OK) {
//                String responseBody = response.getBody();
//
//                JsonNode root = objectMapper.readTree(responseBody);
//                JsonNode sebcHistoricSiteKorNode = root.get("SebcHistoricSiteKor");
//
//                SebcHistoricSiteKor sebcHistoricSiteKor = objectMapper.readValue(sebcHistoricSiteKorNode.toString(), SebcHistoricSiteKor.class);
//
//                SebcHistoricSiteRow firstRow = sebcHistoricSiteKor.getRows().get(0);
//                String mainKey = firstRow.getMainKey();
////            System.out.println("❌" + mainKey);
//                model.addAttribute("sebcHistoricSiteKor", sebcHistoricSiteKor);
//                System.out.println(root);
//                System.out.println(sebcHistoricSiteKorNode.toString());
//                System.out.println(sebcHistoricSiteKor);
//
////                sebcHistoricSiteRowRepository.saveAll(sebcHistoricSiteKor.getRows());
//
////            SebcHistoricSiteRow rowToSave = sebcHistoricSiteKor.getRows().get(0);
////            String saveResult = sebcHistoricSiteRowService.saveHistoricList(rowToSave);
////            System.out.println(saveResult);
////            model.addAttribute("saveResult", saveResult); // 성공 메시지 추가
//            } else {
//                model.addAttribute("errorMessage", "오류가 발생했습니다.");
//            }
//
//            return "cultural/cultural_list";
//        }
//    }

    @GetMapping("/cultural")
    public String cultural(Model model) {
        String url = "http://www.cha.go.kr/cha/SearchKindOpenapiList.do?pageUnit=5&pageIndex=1";
        String urlImg = "https://www.cha.go.kr/cha/SearchImageOpenapi.do";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            String responseBody = response.getBody();

            System.out.println("🍎" + responseBody);

            try {
                ObjectMapper objectMapper = new XmlMapper();
                CultureListResult result = objectMapper.readValue(responseBody, CultureListResult.class);
                System.out.println("❤️" + result);
                List<CultureList> itemList = result.getItem();
                System.out.println("❌" + itemList);

                for (CultureList item : itemList) {
                    String ccbaKdcd = item.getCcbaKdcd();
                    String ccbaAsno = item.getCcbaAsno();
                    String ccbaCtcd = item.getCcbaCtcd();

                    String fullUrl = urlImg + "?ccbaKdcd=" + ccbaKdcd + "&ccbaAsno=" + ccbaAsno + "&ccbaCtcd=" + ccbaCtcd;
                    ResponseEntity<String> responseImg = restTemplate.exchange(fullUrl, HttpMethod.GET, entity, String.class);
                    String responseBodyImg = responseImg.getBody();
                    CultureImgResult imgResult = objectMapper.readValue(responseBodyImg, CultureImgResult.class);
                    List<CultureImg> itemImgList = imgResult.getItem();
                    System.out.println("🌈🌈" + imgResult);
                    System.out.println("🍊🍊" + itemImgList);
//                    System.out.println("🗡️🗡️" + responseBodyImg);

                    model.addAttribute("list", imgResult);
                    model.addAttribute("imageUrl", itemImgList);

                }

                model.addAttribute("result", result);
                model.addAttribute("itemList", itemList);

                cultureListRepository.saveAll(result.getItem());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                model.addAttribute("errorMessage", "XML 파싱에 실패했습니다.");
            }
        } else {
            model.addAttribute("errorMessage", "오류가 발생했습니다.");
        }
        return "cultural/cultural_list";
    }



}
