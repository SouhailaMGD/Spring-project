package com.aerospike.springbootexample.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.aerospike.springbootexample.model.Reservation;

public interface ReservationRepository extends AerospikeRepository<Reservation, Integer> {
}