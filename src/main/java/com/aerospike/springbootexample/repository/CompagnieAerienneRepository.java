package com.aerospike.springbootexample.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.aerospike.springbootexample.model.CompagnieAerienne;

public interface CompagnieAerienneRepository extends AerospikeRepository<CompagnieAerienne, Integer> {
}