package com.hotel.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.idisNotFound;
import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;
import com.hotel.service.HotelService;

@Service
public class HotelImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		Hotel hote = hotelRepository.save(hotel);
		return hote;
	}

	@Override
	public List<Hotel> getAll() {
		List<Hotel> lis = hotelRepository.findAll();
		return lis;
	}

	@Override
	public Hotel getById(Integer id) {
		Hotel findid = hotelRepository.findById(id);
		if(findid== null) {
			throw new idisNotFound("API return the error causes id is not found");
		}
		return findid;
	}

}
