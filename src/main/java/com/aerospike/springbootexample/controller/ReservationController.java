package com.aerospike.springbootexample.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aerospike.springbootexample.model.Reservation;
import com.aerospike.springbootexample.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
 
	@RequestMapping(value = "/allreservations", method = RequestMethod.GET)
	public List<Reservation> getAllReservations() {
 
		return (List<Reservation>) reservationService.listAllReservations();
	}
 
	@RequestMapping(value = "/getreservation/{Id}", method = RequestMethod.GET)
	public Reservation getreservation(@PathVariable("Id") Integer Id) {
		return reservationService.getReservationById(Id);
	}
 
	@RequestMapping(value = "/createreservation", method = RequestMethod.POST)
	public Reservation createreservation(@RequestBody Reservation reservation) {
		Random randomGenerator = new Random();
		reservation.setId(randomGenerator.nextInt(100));
		return reservationService.saveReservation(reservation);
	}
 
	@RequestMapping(value = "/updatereservation/{Id}", method = RequestMethod.POST)
	public Reservation updatereservation(@RequestBody Reservation reservation,@PathVariable("Id") Integer Id) {
		
		return reservationService.saveReservation(reservation);
	}
	
	@RequestMapping(value = "/deletereservation/{Id}", method = RequestMethod.GET)
	public void deletereservation(@PathVariable("Id") Integer Id) {
		//System.out.println(Id);
		reservationService.deleteReservation(Id);
	}
}
