package com.aerospike.springbootexample.service;

import com.aerospike.springbootexample.model.Vol;

public interface VolService {
	
    Iterable<Vol> listAllVols();

    Vol getVolById(Integer id);

     Vol saveVol(Vol vol);

    void deleteVol(Integer id);
}
