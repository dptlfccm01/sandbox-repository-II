package com.sampleapp.db.domain;

public class Customer {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String cardType;
	private String password;
	
	public Customer(){}
	
	public Customer(int id, String firstname, String lastname, String email, String cardType, String password){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.cardType = cardType;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
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
	public void setId(int id) {
		this.id = id;
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
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString(){
		return getId()+", "+getFirstname()+", "+getLastname()+", "+getEmail()+", "+getCardType()+", "+getPassword();
	}
	
}
