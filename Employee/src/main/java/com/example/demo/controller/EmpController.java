package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.EmployeeModel;
import com.example.demo.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empservice;
	@GetMapping("/getEmp")
	public List<EmployeeModel> getEmployees(){
		return empservice.getEmployees();
		
	}
	@GetMapping("/getByEmpId/{id}")
	public EmployeeModel getAddrById(@PathVariable(value="id") int id) {
		
		return empservice.getAddById( id);
		
	}

	

}
