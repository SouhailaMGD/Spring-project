package com.aerospike.springbootexample.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Reservation {

	@Id
	private long id;
	private int nbPlaces;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}
	
	
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	



}
