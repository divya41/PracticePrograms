package com.address.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.address.demo.mapper.AddressRowMapper;
import com.address.demo.model.AddressModel;
@Repository
public class AddDao {
	@Autowired
	JdbcTemplate template;
	public List<AddressModel> getAddresses(){
		String sql="select * from ADDRESS";
		List<AddressModel>  address=template.query(sql,new AddressRowMapper());
		return address;
		
	}
	public AddressModel getAddrById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from ADDRESS where ID="+id;
			
		return template.queryForObject(sql, new AddressRowMapper());
	}

}
