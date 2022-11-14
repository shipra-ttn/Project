package com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name= "SELLER")
public class Seller {

    @OneToOne
    @JoinColumn(name = "user_user_id")
    User user;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int sellerId;
    @NotNull(message = "{com.Project.notnull.gstNumber.message}")
    String gstNumber;
    @NotNull(message = "{com.Project.notnull.contactNumber.message}")
    long contactNumber;
    @NotNull(message = "{com.Project.notnull.companyName.message}")
    String companyName;


}



