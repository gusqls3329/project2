package com.green.project2.mypage;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mypage")
public class MyPageController {
    private final MyPageService service;

    @GetMapping("/{iuser}/prod?loginedIuser=")
    public MyPageSelVo getRentalList(){
return null;
    }
}
