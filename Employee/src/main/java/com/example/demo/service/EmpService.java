package com.example.demo.service;

import java.util.List;

import com.example.demo.model.EmployeeModel;

public interface EmpService {
	public List<EmployeeModel> getEmployees();

	public EmployeeModel getAddById(int id);

}
