package com.project.readBooks.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    /**
     * 로그인 페이지
     * @return
     */
    @GetMapping("/login")
    public String getLoginPage() {
        return "user/login";
    }

    /**
     * 회원가입 페이지
     * @return
     */
    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "user/signUp";
    }
}