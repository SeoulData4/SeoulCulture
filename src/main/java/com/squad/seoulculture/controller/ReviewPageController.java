package com.squad.seoulculture.controller;

import com.squad.seoulculture.repository.FollowRepository;
import com.squad.seoulculture.repository.LkRepository;
import com.squad.seoulculture.repository.ReviewMemberRepository;
import com.squad.seoulculture.repository.ReviewNoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class ReviewPageController {
    private final ReviewMemberRepository reviewMemberRepository;
    private final ReviewNoneRepository reviewNoneRepository;
    private final FollowRepository followRepository;
    private final LkRepository lkRepository;

    @GetMapping(path = "/create_review") // http://localhost:9999/create_review
    public ModelAndView create_review(ModelMap map){
        return new ModelAndView("SeoulCultureReview");
    }

    @GetMapping(path = "/reviews")
    public ModelAndView review_timeline(ModelMap map){
        return new ModelAndView("SeoulCultureTimeline");
    }
}
