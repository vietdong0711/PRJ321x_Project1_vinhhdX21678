package com.example.prj321x_project1_vinhhdx21678.security;

import com.example.prj321x_project1_vinhhdx21678.entity.User;
import lombok.Data;

@Data
public class UserLoginDetails {
    private Long id;
    private String address;
    private String email;
    private String fullname;
    private String note;
    private String phoneNumber;
    private int status;
    private String username;

    public UserLoginDetails(){

    }

    public UserLoginDetails(User user){
        this.id = user.getId();
        this.username = user.getUsername();
        this.fullname = user.getFullname();
        this.address = user.getAddress();
        this.email = user.getEmail();
        this.note = user.getNote();
        this.phoneNumber = user.getPhoneNumber();
        this.status = user.getStatus();
    }
}
