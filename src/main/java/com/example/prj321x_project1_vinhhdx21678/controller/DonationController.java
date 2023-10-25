package com.example.prj321x_project1_vinhhdx21678.controller;

import com.example.prj321x_project1_vinhhdx21678.dto.DonationDTO;
import com.example.prj321x_project1_vinhhdx21678.service.IDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class DonationController {

    @Autowired
    private IDonationService donationService;

    @GetMapping("home1")
    public String hello(ModelMap model, @RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size) {
        int p = page.isPresent() ? page.get() - 1 : 1 - 1;
        int s = size.isPresent() ? size.get() : 1;
        Page<DonationDTO> donationDTOS = donationService.findAll(PageRequest.of(p, s));
        model.addAttribute("categories", donationDTOS);
        return "home";
    }
}
