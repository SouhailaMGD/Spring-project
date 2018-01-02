package com.aerospike.springbootexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerospike.springbootexample.model.Reservation;
import com.aerospike.springbootexample.repository.ReservationRepository;
@Service 
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository; 
	
	@Override
	public Iterable<Reservation> listAllReservations() {
		return reservationRepository.findAll();
		
	}

	@Override
	public Reservation getReservationById(Integer id) {
		return reservationRepository.findOne(id);
	}

	@Override
	public Reservation saveReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public void deleteReservation(Integer id) {
		reservationRepository.delete(id);
		
	}

}
