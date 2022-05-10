package com.address.demo.service;

import java.util.List;

import com.address.demo.model.AddressModel;

public interface AddInterface {
	public List<AddressModel> getAddresses();

	public AddressModel getAddById(int id);

}
