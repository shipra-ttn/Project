package com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {

    @OneToOne
    @JoinColumn(name = "seller_address_seller_id")
   private Seller sellerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_address_customer_id")
   private Customer customerAddress;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AddressId;

    private String city;

    private String state;

    private String country;

    private String addressLine;

    private int zipCode;

    private String lable;
}
