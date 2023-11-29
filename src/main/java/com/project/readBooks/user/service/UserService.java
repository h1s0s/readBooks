package com.project.readBooks.user.service;

import com.project.readBooks.user.domain.User;
import com.project.readBooks.user.domain.UserDto;
import com.project.readBooks.user.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public int createUsers(UserDto userDto){
        return userRepository.save(userDto);
    }
}
