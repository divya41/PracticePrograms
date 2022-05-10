package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Empdao;
import com.example.demo.model.EmployeeModel;
@Service
public class EmpServiceImpl implements EmpService {
@Autowired
Empdao empdao;
	@Override
	public List<EmployeeModel> getEmployees() {
		// TODO Auto-generated method stub
		return empdao.getEmployees();
	}
	@Override
	public EmployeeModel getAddById(int id) {
		// TODO Auto-generated method stub
		return empdao.getById(id);
	}

}
