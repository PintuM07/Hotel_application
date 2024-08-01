package com.hotelApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotelApplication.entity.Booking; 

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
