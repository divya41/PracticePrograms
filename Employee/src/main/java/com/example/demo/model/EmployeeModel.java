package com.example.demo.model;

public class EmployeeModel {
	private int Id;
	private String Name;
	private String Gender;
	private float Salary;
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
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public EmployeeModel(int id, String name, String gender, float salary) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Salary = salary;
	}
	
	

}
