package com.squad.seoulculture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/culture")
public class CultureController {



    @GetMapping("")
    public String cultural (Model model){

        return "/cultural/cultural_list";
    }
}
