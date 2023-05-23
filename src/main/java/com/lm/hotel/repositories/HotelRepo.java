package com.lm.hotel.repositories;

import com.lm.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface HotelRepo extends JpaRepository<Hotel, String> {
}
