package com.example.prj321x_project1_vinhhdx21678.repository;

import com.example.prj321x_project1_vinhhdx21678.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
