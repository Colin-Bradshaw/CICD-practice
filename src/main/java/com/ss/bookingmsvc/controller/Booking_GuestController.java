package com.ss.bookingmsvc.controller;


import com.ss.bookingmsvc.entity.Booking_Guest;
import com.ss.bookingmsvc.service.Booking_GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class Booking_GuestController {
    @Autowired
    Booking_GuestService booking_GuestService;

    // read
    @RequestMapping(path = "/lms/booking_guest/{id}", method = RequestMethod.GET)
    public Booking_Guest getBooking_GuestByBookingID(@PathVariable int id){
        return booking_GuestService.getBooking_GuestByBookingID(id);
    }
    // create
    @RequestMapping(path = "/lms/booking_guest", method = RequestMethod.POST)
    public void addBooking_Guest(@RequestBody Booking_Guest bg){
        try {
            booking_GuestService.addBookingGuest(bg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    // update
    @RequestMapping(path = "/lms/booking_guest", method = RequestMethod.PATCH)
    public void updateBooking_Guest(@RequestBody Booking_Guest bg){
        try {
            booking_GuestService.updateBookingGuest(bg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    // delete
    @RequestMapping(path = "/lms/booking_guest", method = RequestMethod.DELETE)
    public void deleteBooking_Guest(@RequestBody Booking_Guest bg){
        try {
            booking_GuestService.deleteBookingGuest(bg);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
