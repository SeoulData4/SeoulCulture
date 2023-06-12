package com.squad.seoulculture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
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

/*        // 로그인 기능 구현
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
        }*/


    @GetMapping("join")
    public String join1() {
        return "joinAgree";
    }

    @GetMapping("join2")
    public String join2() {
        return "joinAgree2";
    }


}
