package com.hotelApplication.controller;

import com.hotelApplication.entity.Booking;
import com.hotelApplication.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HotelController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/rooms")
    public String rooms() {
        return "rooms";
    }

    @GetMapping("/amenities")
    public String amenities() {
        return "amenities";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/booking")
    public String bookingForm(Model model) {
        model.addAttribute("booking", new Booking());
        return "booking";
    }

    @PostMapping("/booking")
    public String bookingSubmit(Booking booking, Model model) {
        bookingService.save(booking); // Save the booking to the database
        model.addAttribute("booking", booking);
        return "booking";
    }
}
