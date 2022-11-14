package com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long roleId;
    String Authority;


    @OneToOne()
    @JoinColumn(name = "user_user_id")
    private User user;
}
