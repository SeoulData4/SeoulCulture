package com.squid.seoulculture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class CulturalController {

    @GetMapping("")
    public String index () {
        return "index";
    }

    @GetMapping("/cultural")
    public String cultural (Model model){

        return "/cultural/cultural_list";
    }
}
