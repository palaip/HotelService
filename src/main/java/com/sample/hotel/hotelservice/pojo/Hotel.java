package com.sample.hotel.hotelservice.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
	@Id
	private String hotelId;
	private String hotelName;
	private String about;
	private String location;
	
	

}
