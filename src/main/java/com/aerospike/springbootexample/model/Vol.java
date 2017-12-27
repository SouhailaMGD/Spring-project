package com.aerospike.springbootexample.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Vol {

	@Id
    private Integer id;
	private Date dateDepart;
	private Date dateArrivee;
	private int duree;
	private int nombrePlaces;
	private boolean flag_reservation;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public int getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	public boolean isFlag_reservation() {
		return flag_reservation;
	}
	public void setFlag_reservation(boolean flag_reservation) {
		this.flag_reservation = flag_reservation;
	}
	
}
