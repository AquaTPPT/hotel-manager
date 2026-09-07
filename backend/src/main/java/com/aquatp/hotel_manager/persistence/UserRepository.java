package com.aquatp.hotel_manager.persistence;

import com.aquatp.hotel_manager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
