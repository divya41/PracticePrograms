package com.details.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.details.demo.model.EmployeeDetail;
@Service
public class DetaServiceImpl implements DetaiInterface{
@Autowired
RestTemplate template;

	@Override
	public EmployeeDetail getFullDeta(int id) {
		// TODO Auto-generated method stub
		String url="http://client_employee/getByEmpId/"+id;
	EmployeeDetail	empdetail=template.getForObject(url, EmployeeDetail.class);
	String url1="http://localhost:8080/getById/"+id;
	EmployeeDetail detail=template.getForObject(url1, EmployeeDetail.class);
	empdetail.setStreet(detail.getStreet());
	empdetail.setCity(detail.getCity());
	empdetail.setState(detail.getState());
	return empdetail;
	}

}
