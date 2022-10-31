package com.ecommerceshopping.cart.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "employees")
public class Employee {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

}
