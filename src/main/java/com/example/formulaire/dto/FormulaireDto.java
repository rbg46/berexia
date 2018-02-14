package com.example.formulaire.dto;

public class FormulaireDto {

private int id_;
private String firstname;
private String lastname;
private int age_;
private String email_adress;
private String adress_;
private int phoneNumber;

public FormulaireDto() {}


public int getId_() {
	return id_;
}
public void setId_(int id_) {
	this.id_ = id_;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge_() {
	return age_;
}
public void setAge_(int age_) {
	this.age_ = age_;
}
public String getEmail_adress() {
	return email_adress;
}
public void setEmail_adress(String email_adress) {
	this.email_adress = email_adress;
}
public String getAdress_() {
	return adress_;
}
public void setAdress_(String adress_) {
	this.adress_ = adress_;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public FormulaireDto(int id_, String firstname, String lastname, int age_, String email_adress, String adress_,
		int phoneNumber) {
	super();
	this.id_ = id_;
	this.firstname = firstname;
	this.lastname = lastname;
	this.age_ = age_;
	this.email_adress = email_adress;
	this.adress_ = adress_;
	this.phoneNumber = phoneNumber;
}
	
	
}
