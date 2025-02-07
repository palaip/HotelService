package com.sample.hotel.hotelservice.service;

import java.util.List;

import com.sample.hotel.hotelservice.pojo.Hotel;

public interface HotelService {

	Hotel creatHotel(Hotel hotelreq);

	List<Hotel> getAllHotel();

	Hotel getHotelByID(String id);

}
