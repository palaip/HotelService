package com.sample.hotel.hotelservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.hotel.hotelservice.pojo.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
