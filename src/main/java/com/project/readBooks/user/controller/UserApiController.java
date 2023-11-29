package com.project.readBooks.user.controller;

import com.project.readBooks.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserApiController {

    @Autowired
    UserService userService;

    // 모든 사용자 정보 반환
//    @GetMapping
//    public String getAllUsers() {
//
//    }

    // 유저 회원가입 API
    @PostMapping
    public ResponseEntity<Object> createUser(){
        return null;
    }

    // 유저 정보 수정 API

}
