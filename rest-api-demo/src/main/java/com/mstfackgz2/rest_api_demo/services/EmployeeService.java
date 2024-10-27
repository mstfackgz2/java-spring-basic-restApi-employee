package com.mstfackgz2.rest_api_demo.services;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mstfackgz2.rest_api_demo.model.Employee;
import com.mstfackgz2.rest_api_demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployeeList(){
			
			
			return employeeRepository.getAllEmployeeList();
	}

	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}

	public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
		return employeeRepository.getEmployeeWithParams(firstName,lastName);
	}

	public Employee saveEmployee(Employee newEmployee) {
		
		return employeeRepository.saveEmployee(newEmployee);
	}

	public boolean deleteEmployee(String id) {
		return employeeRepository.deleteEmployee(id);
	}
	
	public boolean updateEmployee(Employee newEmployee ) {
		return employeeRepository.updateEmployee(newEmployee);
	}

}
