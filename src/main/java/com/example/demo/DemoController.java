package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 어노테이션 명시
public class DemoController {
    @GetMapping("/hello") // 전송 방식 GET

    public String hello(Model model) {
        model.addAttribute("data", " 반갑습니다."); // model 설정
        return "hello"; // hello.html 연결
    }

    @GetMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("name", "유유솔");
        model.addAttribute("age", 22);
        model.addAttribute("major", "미디어소프트웨어");
        model.addAttribute("hobby", "영화");
        model.addAttribute("today", "2026-09-01");
        return "hello2"; // hello2.html 연결
    }
}