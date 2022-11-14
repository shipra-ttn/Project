package com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @OneToOne
    @JoinColumn(name = "user_user_id")
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int customerId;
   private long customerContactNumber;
}
