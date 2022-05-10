package com.address.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.address.demo.model.AddressModel;

public class AddressRowMapper implements org.springframework.jdbc.core.RowMapper<AddressModel>{

	@Override
	public AddressModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		AddressModel address=new AddressModel();
		address.setId(rs.getInt("ID"));
		address.setStreet(rs.getString("STREET"));
		address.setCity(rs.getString("CITY"));
		address.setState(rs.getString("STATE"));
		return address;
	}

}
