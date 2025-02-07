package com.sample.hotel.hotelservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.hotel.hotelservice.exception.ResourceNotFoundException;
import com.sample.hotel.hotelservice.pojo.Hotel;
import com.sample.hotel.hotelservice.repo.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository repository;

	@Override
	public Hotel creatHotel(Hotel hotelreq) {
		// TODO Auto-generated method stub

		String hotelID = UUID.randomUUID().toString();
		hotelreq.setHotelId(hotelID);
		return repository.save(hotelreq);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hotel getHotelByID(String id) {
		// TODO Auto-generated method stub

		System.out.println("hotel **" + repository.findById(id));

		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("resource not found  " + id));
	}

}
