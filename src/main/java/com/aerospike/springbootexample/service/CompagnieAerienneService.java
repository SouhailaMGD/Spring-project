package com.aerospike.springbootexample.service;

import com.aerospike.springbootexample.model.CompagnieAerienne;

public interface CompagnieAerienneService {
	Iterable<CompagnieAerienne> listAllCompagnieAeriennes();

	CompagnieAerienne getCompagnieAerienneById(Integer id);

	CompagnieAerienne saveCompagnieAerienne(CompagnieAerienne vol);

    void deleteCompagnieAerienne(Integer id);
}
