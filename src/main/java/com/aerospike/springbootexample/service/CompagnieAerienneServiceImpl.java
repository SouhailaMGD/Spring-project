package com.aerospike.springbootexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aerospike.client.query.IndexType;
import com.aerospike.springbootexample.model.CompagnieAerienne;
import com.aerospike.springbootexample.repository.CompagnieAerienneRepository;
@Service 
public class CompagnieAerienneServiceImpl implements CompagnieAerienneService {
    /* public CompagnieAerienneServiceImpl()
     {
    	 compagnieAerienneRepository.createIndex(CompagnieAerienne.class,"login_index","login", IndexType.STRING);
     }*/
	@Autowired
	private CompagnieAerienneRepository compagnieAerienneRepository; 
	
	@Override
	public Iterable<CompagnieAerienne> listAllCompagnieAeriennes() {
		return compagnieAerienneRepository.findAll();
	}
    
	@Override
	public CompagnieAerienne getCompagnieAerienneById(Integer id) {
		return compagnieAerienneRepository.findOne(id);
	}

	@Override
	public CompagnieAerienne saveCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		return compagnieAerienneRepository.save(compagnieAerienne);
	}

	@Override
	public void deleteCompagnieAerienne(Integer id) {
		compagnieAerienneRepository.delete(id);
		
	}
	public Iterable<CompagnieAerienne> getByLogin(String login)
	{
		compagnieAerienneRepository.createIndex(CompagnieAerienne.class,"login_index", "login", IndexType.STRING);
	    return compagnieAerienneRepository.findByLogin(login);
	}
	
	

}
