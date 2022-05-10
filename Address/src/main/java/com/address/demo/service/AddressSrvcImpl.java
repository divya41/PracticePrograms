package com.address.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.demo.dao.AddDao;
import com.address.demo.model.AddressModel;
@Service
public class AddressSrvcImpl implements AddInterface {
@Autowired
AddDao dao;

	@Override
	public List<AddressModel> getAddresses() {
		// TODO Auto-generated method stub
		return dao.getAddresses();
	}

	@Override
	public AddressModel getAddById(int id) {
		// TODO Auto-generated method stub
		return dao.getAddrById(id);
	}

}
