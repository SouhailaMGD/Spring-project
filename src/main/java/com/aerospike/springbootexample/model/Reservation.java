package com.aerospike.springbootexample.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Reservation {

	@Id
	private long idReservation;
	private Date date;
	private int nbPlaces;
	
	public Reservation(int nbPlaces) {
		super();
		this.nbPlaces = nbPlaces;
	}
	
	public int getNbPlaces() {
		return nbPlaces;
	}
	
	
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}


	public Date getDate() {
		return date;
	}
	
	
	public void setDate(Date date) {
		this.date=date;
	}
}
