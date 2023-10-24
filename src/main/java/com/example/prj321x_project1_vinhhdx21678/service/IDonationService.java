package com.example.prj321x_project1_vinhhdx21678.service;

import com.example.prj321x_project1_vinhhdx21678.dto.DonationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDonationService {

    Page<DonationDTO> findAll(Pageable pageable);
}
