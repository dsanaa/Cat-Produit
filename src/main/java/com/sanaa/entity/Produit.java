package com.sanaa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Produit implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long reference;
 private String designation;
 private Double prix;
public Long getReference() {
	return reference;
}
public void setReference(Long reference) {
	this.reference = reference;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}
public Produit() {
	super();
}
public Produit(String designation, Double prix) {
	super();
	this.designation = designation;
	this.prix = prix;
}
 
}

