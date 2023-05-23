package com.lm.hotel.services.impl;

import com.lm.hotel.entities.Hotel;
import com.lm.hotel.exceptions.ResourceNotFoundException;
import com.lm.hotel.repositories.HotelRepo;
import com.lm.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hRepo;

    @Override
    public Hotel create (Hotel hotel) {

        // generate random hotelId:
        String randomHotelId = UUID.randomUUID().toString();
        hotel.setId(randomHotelId);

        return hRepo.save(hotel);

    }

    @Override
    public List<Hotel> getAllHotels () {
        return hRepo.findAll();
    }

    @Override
    public Hotel getHotel (String hotelId) {
        return hRepo.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not " +
                "found: " + hotelId));

    }
}
