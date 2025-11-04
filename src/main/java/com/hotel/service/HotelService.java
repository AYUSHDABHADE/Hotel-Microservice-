package com.hotel.service;

import java.util.List;

import com.hotel.model.Hotel;

public interface HotelService {

	public Hotel saveHotel(Hotel hotel);

	public List<Hotel> getAll();

	public Hotel getById(Integer id);
}
