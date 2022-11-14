package com.springsecurity.demo.springsecurityoauth2bootcampmaven.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
}
