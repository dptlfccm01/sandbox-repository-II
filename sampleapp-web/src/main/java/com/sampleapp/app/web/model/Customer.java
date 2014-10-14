package com.sampleapp.app.web.model;

public class Customer {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String cardType;
	private String password;
	
	public Customer(){}//zero argument constructor required for the model

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getCardType() {
		return cardType;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
