package com.example.prj321x_project1_vinhhdx21678.service.impl;

import com.example.prj321x_project1_vinhhdx21678.dto.DonationDTO;
import com.example.prj321x_project1_vinhhdx21678.entity.Donation;
import com.example.prj321x_project1_vinhhdx21678.repository.IDonationRepository;
import com.example.prj321x_project1_vinhhdx21678.service.IDonationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DonationServiceImpl implements IDonationService {

    @Autowired
    private IDonationRepository donationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Page<DonationDTO> findAll(Pageable pageable){
        Page<Donation> donationPage = donationRepository.findAll(pageable);
        Page<DonationDTO> donationDTOS = donationPage.map(new Function<Donation, DonationDTO>() {
            @Override
            public DonationDTO apply(Donation donation) {
                return modelMapper.map(donation, DonationDTO.class);
            }
        });
        return donationDTOS;
    }

}
