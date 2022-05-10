package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.EmployeeModel;

public class EmpRowMapper implements RowMapper<EmployeeModel> {

	@Override
	public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeModel empMdl=new EmployeeModel();
		empMdl.setId(rs.getInt("ID"));
		empMdl.setName(rs.getString("NAME"));
		empMdl.setGender(rs.getString("GENDER"));
		empMdl.setSalary(rs.getFloat("SALARY"));
		return empMdl;
	}

}
