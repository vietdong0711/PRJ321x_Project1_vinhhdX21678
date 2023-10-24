package com.example.prj321x_project1_vinhhdx21678.utils;

import com.example.prj321x_project1_vinhhdx21678.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Objects;

public class ContextUtils {
    @Autowired
    private static IUserRepository userRepository;

    public static Long getAccountId(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (Objects.nonNull(authentication.getPrincipal()) && authentication.getPrincipal() instanceof UserDetails){
//            UserDetails u = ((UserDetails) authentication.getPrincipal()).getUsername();
//
//        }


        return 0L;
    }
}
