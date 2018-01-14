package com.aerospike.springbootexample.model;
import org.springframework.data.annotation.Id;

public class Admin {
@Id
private long id_admin;
private  String login;
private String motDePasse;
public long getId_admin() {
	return id_admin;
}
public void setId_admin(long id_admin) {
	this.id_admin = id_admin;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMotDePasse() {
	return motDePasse;
}
public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
}

}
