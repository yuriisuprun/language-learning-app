package com.example.user_management_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

/**
 * @author Yurii_Suprun
 */
@Entity
@Data
public class CustomUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_user_seq")
    @SequenceGenerator(name = "custom_user_seq", sequenceName = "custom_user_seq", allocationSize = 1)
    private Long id;
    private String username;
    private String password;
    private String role; // ADMIN, USER ...
}
