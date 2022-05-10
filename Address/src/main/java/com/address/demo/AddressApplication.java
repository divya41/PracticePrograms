package com.address.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@Configuration
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}
	@Bean
    public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
       dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
       dataSource.setUsername( "SYSTEM" );
       dataSource.setPassword( "root" );
       return dataSource;
    }
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource datasource) {
		return  new JdbcTemplate(datasource);
	}
}
