package com.lm.hotel.services;

import com.lm.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    // create Hotel:
    Hotel create(Hotel hotel);


    // get All Hotels:
    List<Hotel> getAllHotels();



    // get Hotel:
    Hotel getHotel(String hotelId);
}
