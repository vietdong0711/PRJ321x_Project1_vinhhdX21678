package com.example.prj321x_project1_vinhhdx21678.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String email;
    private String fullname;
    private String note;
    private String password;
    private String phoneNumber;
    private int status;
    private String username;
    private String created;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
