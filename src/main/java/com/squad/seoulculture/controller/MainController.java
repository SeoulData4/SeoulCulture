package com.squad.seoulculture.controller;


import com.squad.seoulculture.service.ProfileLogicService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

    private final ProfileLogicService profileLogicService;

    @GetMapping("")
    public String index() {
        return "index";
    }

        @GetMapping("header")
        public String header (ModelMap map){
            return "/fragment/header";
        }

        @GetMapping("footer")
        public String footer (ModelMap map){
            return "/fragment/footer";

        }

        // 로그인 page
        @GetMapping("login")
        public ModelAndView login () {
            return new ModelAndView("login");
        }

        // 로그인 기능 구현
        @PostMapping(path = "/loginOk")
        public String loginOk (HttpServletRequest request, String prId, String prUserpw){
            if (profileLogicService.read(prId, prUserpw).getData() != null) {
                HttpSession session = request.getSession();
                String name = profileLogicService.read(prId, prUserpw).getData().getPrName();
                session.setAttribute("name", name);
                return "redirect:/";
            } else {
                return "redirect:/login";
            }
        }

        // 회원가입 동의 1단계
        @GetMapping("join")
        public String joinPrev () {


            return "joinAgree";
        }

        // 회원가입
        @GetMapping("join2")
        public String join () {


            return "joinAgree2";
        }

//    // 중복확인
//    @PostMapping("/idCheck")
//    @ResponseBody
//    public boolean nickCheck(@RequestParam("prId")String prId){
//        Optional<Profile> profile = profileService.checkNick(prId);
//        if (profile.isEmpty()){
//            return true;
//        }else {
//            return false;
//        }
//    }
}
