package com.aerospike.springbootexample.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerospike.springbootexample.model.Vol;
import com.aerospike.springbootexample.repository.VolRepository;

@Service
public class VolServiceImpl implements VolService{
     
	
	@Autowired
	private VolRepository volRepository; 
	@Override
	public Iterable<Vol> listAllVols() {
		return volRepository.findAll();
	}

	@Override
	public Vol getVolById(Integer id) {
		return volRepository.findOne(id);
	}

	@Override
	public Vol saveVol(Vol vol) {
		return volRepository.save(vol);
	}

	@Override
	public void deleteVol(Integer id) {
		volRepository.delete(id);
		
	}

}
