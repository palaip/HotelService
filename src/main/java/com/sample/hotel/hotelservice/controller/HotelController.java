package com.sample.hotel.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.hotel.hotelservice.pojo.Hotel;
import com.sample.hotel.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("/allhotels")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> list = hotelService.getAllHotel();
		return ResponseEntity.status(HttpStatus.OK).body(list);

	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> findhotelID(@PathVariable String hotelId) {
		System.out.println("hotel id " + hotelId);
		Hotel hotel = hotelService.getHotelByID(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);

	}

	@PostMapping("/savehotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotelRequest) {

		Hotel hotel = hotelService.creatHotel(hotelRequest);

		return ResponseEntity.status(HttpStatus.CREATED).body(hotel);

	}
}
