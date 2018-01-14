package com.aerospike.springbootexample.model;


import org.springframework.data.annotation.Id;

public class Vol {
   @Id
    private Integer id;
	private String dateDepart;
	private String dateArrivee;
	private String heureDepart;
	private String heureArrivee;
	private String VilleDepart;
	private String VilleArrivee;
	private int nombrePlaces;
	//private Integer id_compagnie;
	/*public Integer getId_compagnie() {
		return id_compagnie;
	}
	public void setId_compagnie(Integer id_compagnie) {
		this.id_compagnie = id_compagnie;
	}*/
	public String getVilleDepart() {
		return VilleDepart;
	}
	public void setVilleDepart(String villeDepart) {
		VilleDepart = villeDepart;
	}
	public String getVilleArrivee() {
		return VilleArrivee;
	}
	public void setVilleArrivee(String villeArrivee) {
		VilleArrivee = villeArrivee;
	}
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
	
}
