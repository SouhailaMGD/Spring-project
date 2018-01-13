package com.aerospike.springbootexample.model;


import org.springframework.data.annotation.Id;

public class Vol {
   @Id
    private Integer id;
	private String dateDepart;
	private String dateArrivee;
	private String heureDepart;
	private String heureArrivee;
	public String getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	public String getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(String heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	private int nombrePlaces;
	//private boolean flag_reservation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}
	public String getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(String dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	
	public int getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	/*public boolean isFlag_reservation() {
		return flag_reservation;
	}
	public void setFlag_reservation(boolean flag_reservation) {
		this.flag_reservation = flag_reservation;
	}*/
	
}
