package com.example.prj321x_project1_vinhhdx21678.dto;

import lombok.Data;

@Data
public class DonationDTO {

    private Long id;
    private String code;
    private String created;
    private String description;
    private String endDate;
    private int money;
    private String name;
    private String organizationName;
    private String phoneNumber;
    private String startDate;
    private int status;

}
