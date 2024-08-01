package com.hotelApplication.service;

import com.hotelApplication.entity.Booking;
import java.util.List;

public interface BookingService {
    Booking save(Booking booking);
    List<Booking> getAllBookings();
    Booking getBookingById(Long id);
    void deleteBooking(Long id);
}
