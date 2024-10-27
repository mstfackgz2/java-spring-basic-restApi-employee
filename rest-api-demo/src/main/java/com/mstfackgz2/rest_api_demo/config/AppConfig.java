package com.mstfackgz2.rest_api_demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mstfackgz2.rest_api_demo.model.Employee;

@Configuration
public class AppConfig {
	
	
	@Bean
	public List<Employee> employeeList(){
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Mustafa","Açıkgöz"));
		employeeList.add(new Employee("2","Hasan","Ali"));
		employeeList.add(new Employee("3","Veli","Selim"));
		employeeList.add(new Employee("4","Dorduncu","Kişi"));
		employeeList.add(new Employee("5","Besinci","İnsan"));
		employeeList.add(new Employee("6","Veli","Ali"));
		
		return employeeList;
		
	}
}
