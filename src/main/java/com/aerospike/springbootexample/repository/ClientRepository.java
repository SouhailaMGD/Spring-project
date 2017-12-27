package com.aerospike.springbootexample.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.aerospike.springbootexample.model.Client;

public interface ClientRepository extends AerospikeRepository<Client, Integer> {
}