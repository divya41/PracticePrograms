package com.address.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.address.demo.model.AddressModel;
import com.address.demo.service.AddInterface;

@RestController
public class AddrController {
	@Autowired
	AddInterface addservice;
	@GetMapping("/getAddress")
	public List<AddressModel> getAddress(){
		return addservice.getAddresses();
		
	}
	@GetMapping("/getById/{id}")
	public AddressModel getAddrById(@PathVariable(value="id") int id) {
		
		return addservice.getAddById( id);
		
	}

}
