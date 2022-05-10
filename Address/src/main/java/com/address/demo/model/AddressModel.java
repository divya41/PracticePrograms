package com.address.demo.model;

public class AddressModel {
	private int Id;
	private String  Street;
	private String City;
	private String State;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public AddressModel(int id, String street, String city, String state) {
		super();
		Id = id;
		Street = street;
		City = city;
		State = state;
	}
	public AddressModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
