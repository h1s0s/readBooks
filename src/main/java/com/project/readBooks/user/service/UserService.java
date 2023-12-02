package com.project.readBooks.user.service;

import com.project.readBooks.user.domain.User;
import com.project.readBooks.user.domain.UserDto;
import com.project.readBooks.user.domain.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * 유저 회원가입
     * @param user
     * @return
     */
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Transactional
    public void updateUser(User user){
        User findUser = userRepository.findByUserNo(user.getUserNo());
        if(findUser != null){
            findUser.setPassword(user.getPassword());
            userRepository.save(findUser);
        }
    }
    /**
     * 유저 삭제
     * @param user
     */
    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
