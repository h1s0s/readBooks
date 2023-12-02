package com.project.readBooks.user.service;

import com.project.readBooks.user.domain.User;
import com.project.readBooks.user.domain.UserDto;
import com.project.readBooks.user.domain.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("유저 회원가입 성공")
    public void saveTest(){
        //given
        User newUser = new User();
        newUser.setId("abc");
        newUser.setPassword("1234");

        //when
        userRepository.save(newUser);

        //then
        List<User> results = userRepository.findAll();
        Assertions.assertThat(results).hasSize(1);
    }

    @Test
    @DisplayName("유저 회원정보 수정 성공")
    public void updateTest(){
        //given
        User newUser = new User();
        newUser.setId("abc");
        newUser.setPassword("1234");

        //when
        userRepository.save(newUser);

        //then
        List<User> results = userRepository.findAll();
        Assertions.assertThat(results).hasSize(1);
    }
}
