package com.project.readBooks.user.service;

import com.project.readBooks.user.domain.User;
import com.project.readBooks.user.domain.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    @DisplayName("유저 회원가입 성공")
    public void saveTest(){
        //given
        User newUser = new User();
        newUser.setUserId("abc");
        newUser.setPassword("1234");

        //when
        userService.createUser(newUser);

        //then
        List<User> results = userRepository.findAll();
        Assertions.assertThat(results).hasSize(1);
    }

    @Test
    @DisplayName("유저 회원정보 수정 성공")
    public void updateTest(){
        //given
        User newUser = new User();
        newUser.setUserId("abc");
        newUser.setPassword("1234");
        userService.createUser(newUser);
        Optional<User> optionalUser = userRepository.findByUserId("abc");

        //when
        if(optionalUser.isPresent()){
            User updateUser = optionalUser.get();
            updateUser.setPassword("4321");
            userService.updateUser(updateUser);
        } else {
            Assertions.fail("User with ID 'abc' not found");
        }

        //then
        Optional<User> userOptional = userRepository.findByUserId("abc");
        userOptional.ifPresentOrElse(
                user -> Assertions.assertThat(user.getPassword()).isEqualTo("4321"),
                () -> Assertions.fail("User with ID 'abc' not found")
        );
    }
}
