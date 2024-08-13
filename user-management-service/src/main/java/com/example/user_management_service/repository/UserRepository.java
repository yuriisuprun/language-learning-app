package com.example.user_management_service.repository;

import com.example.user_management_service.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Yurii_Suprun
 */
public interface UserRepository extends JpaRepository<CustomUser, Long> {

    Optional<CustomUser> findByUsername(String username);
}
