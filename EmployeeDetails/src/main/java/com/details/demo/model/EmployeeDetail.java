package com.details.demo.model;

public class EmployeeDetail {
	private int Id;
	private String Name;
	private String Gender;
	private float Salary;
	private String  Street;
	private String City;
	private String State;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
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
	public EmployeeDetail(int id, String name, String gender, float salary, String street, String city, String state) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Salary = salary;
		Street = street;
		City = city;
		State = state;
	}
	public EmployeeDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
