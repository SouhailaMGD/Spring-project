package com.aerospike.springbootexample.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.aerospike.springbootexample.model.Vol;

public interface VolRepository extends AerospikeRepository<Vol, Integer> {
}