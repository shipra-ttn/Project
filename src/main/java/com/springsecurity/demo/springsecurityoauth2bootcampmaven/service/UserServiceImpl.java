package com.springsecurity.demo.springsecurityoauth2bootcampmaven.service;

import com.springsecurity.demo.springsecurityoauth2bootcampmaven.dto.UserDto;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities.Role;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.repositories.RoleRepository;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    RoleRepository roleRepository;
    PasswordEncoder passwordEncoder;
    @Override
    public void saveUser(UserDto userDto) {

        User user = new User();
        user.setName(userDto.getFirstName() + " " + userDto.getMiddleName()+" "+userDto.getLastName());
        user.setEmailId(userDto.getEmail());

        user.setPassword(passwordEncoder.encode(userDto.getPassword()));

        Role role = roleRepository.findByName("ROLE_ADMIN");
        if(role == null){
            role = checkRoleExist();
        }
        user.setRole(role);
        userRepository.save(user);
    }

    private Role checkRoleExist() {
        Role role = new Role();
        role.setAuthority("ROLE_ADMIN");
        return roleRepository.save(role);
    }


    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return null;
    }
}
