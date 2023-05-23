package com.lm.hotel.controllers;

import com.lm.hotel.entities.Hotel;
import com.lm.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hService;

    /*===create Hotels:===*/
    @PostMapping("/")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel saveHotel = hService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveHotel);
    }


    /*===get Hotels:===*/
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotels(@PathVariable String hotelId) {
        Hotel hotel = hService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }


    /*===get All Hotels:===*/
    @GetMapping("/")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotel = hService.getAllHotels();
        return ResponseEntity.ok(hotel);
    }
}
