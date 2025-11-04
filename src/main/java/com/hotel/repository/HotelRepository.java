package com.hotel.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Serializable> {
	public Hotel findById(Integer id);
}
