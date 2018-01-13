package com.aerospike.springbootexample.model;

import org.springframework.data.annotation.Id;

public class Client {

	@Id
	private long id_client;
	private String nom;
	private String prenom;
	private String adresse;
	private String numTel;
	private int nbPlaces;
	private long vol_id;
	public long getVol_id() {
		return vol_id;
	}

	public void setVol_id(long vol_id) {
		this.vol_id = vol_id;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}


	public long getId_client() {
		return id_client;
	}

	public void setId_client(long id_client) {
		this.id_client = id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

}
