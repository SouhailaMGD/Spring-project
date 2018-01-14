package com.aerospike.springbootexample.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.aerospike.springbootexample.model.Admin;

public interface AdminRepository extends AerospikeRepository<Admin, Integer>{

}
