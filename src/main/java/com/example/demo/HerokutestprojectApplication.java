package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class HerokutestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokutestprojectApplication.class, args);
	}

	String driverClass= "org.postgresql.Driver";


	@Bean
	public DataSource dataSource(){
		//System.out.println(driverClass+" "+ url+" "+username+" "+password);
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName(driverClass);
		source.setUrl("postgres://mwqqylwlzmatra:e20c42cd92d749d1c6ec32359d367977b78736922240a3d8e608f435b17322e9@ec2-50-17-231-192.compute-1.amazonaws.com:5432/dara7v6hl5ilrr");
		source.setUsername("mwqqylwlzmatra");
		source.setPassword("e20c42cd92d749d1c6ec32359d367977b78736922240a3d8e608f435b17322e9");
		return source;
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(){
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource());
		return namedParameterJdbcTemplate;
	}

}
