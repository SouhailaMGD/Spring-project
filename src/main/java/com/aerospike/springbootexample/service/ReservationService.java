package com.aerospike.springbootexample.service;

import com.aerospike.springbootexample.model.Reservation;

public interface ReservationService {
	Iterable<Reservation> listAllReservations();

	Reservation getReservationById(Integer id);

	Reservation saveReservation(Reservation reservation);

    void deleteReservation(Integer id);
}
