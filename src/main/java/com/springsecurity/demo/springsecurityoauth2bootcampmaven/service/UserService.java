package com.springsecurity.demo.springsecurityoauth2bootcampmaven.service;

import com.springsecurity.demo.springsecurityoauth2bootcampmaven.dto.UserDto;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
