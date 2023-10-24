package com.example.prj321x_project1_vinhhdx21678.controller;

import com.example.prj321x_project1_vinhhdx21678.dto.DonationDTO;
import com.example.prj321x_project1_vinhhdx21678.service.IDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonationController {

    @Autowired
    private IDonationService donationService;

    @GetMapping("home1")
    public String hello(ModelMap model, Pageable pageable) {
        Page<DonationDTO> donationDTOS = donationService.findAll(pageable);
        model.addAttribute("categories", donationDTOS.getContent());
        return "home";
    }
}
