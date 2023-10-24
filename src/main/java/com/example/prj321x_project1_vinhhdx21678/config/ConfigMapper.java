package com.example.prj321x_project1_vinhhdx21678.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class ConfigMapper {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
