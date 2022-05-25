package com.details.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.details.demo.model.EmployeeDetail;
import com.details.demo.service.DetaiInterface;

@RestController
public class detcontroller {
	@Autowired
	DetaiInterface service;
	@GetMapping("/getByDetailId/{id}")
	public EmployeeDetail getFullEmpDetails(@PathVariable("id")int id) {
		
		return service.getFullDeta( id);
		
	}
			

}
