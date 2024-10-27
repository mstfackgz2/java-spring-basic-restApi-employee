package com.mstfackgz2.rest_api_demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mstfackgz2.rest_api_demo.model.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	private List<Employee> employeeList;
	
	
	public List<Employee> getAllEmployeeList(){
		return employeeList;
	}
	
	public Employee getEmployeeById(String id) {
		Employee findEmployee = null;
		for (Employee employee : employeeList) {
			if(employee.getId().equals(id)) {
				findEmployee = employee;
				break;
			}
		}
		return findEmployee ;
	}

	public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
		List<Employee> findedEmployee =  new ArrayList<>();
		
		if (firstName == null && lastName == null) {
			return employeeList;
		}
		for (Employee employee : employeeList) {
			if (firstName != null && lastName != null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
					findedEmployee.add(employee);
				}
			}
			
			if (firstName != null && lastName == null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)) {
					findedEmployee.add(employee);
				}			
			}
			
			if (firstName == null && lastName != null) {
				if (employee.getLastName().equalsIgnoreCase(lastName)) {
					findedEmployee.add(employee);
				}
			}
		}	
		return findedEmployee;
	}

	public Employee saveEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
		System.out.println(newEmployee.getFirstName() + " "+newEmployee.getLastName() +" is saved");
		return newEmployee;
	}

	public boolean deleteEmployee(String id) {
		for (Employee employee : employeeList) {
			if (employee.getId().equals(id)) {
				return employeeList.remove(employee);
			}
		}
		return false;
	}
	
	public boolean updateEmployee(Employee newEmployee) {		
		for (Employee employee : employeeList) {
			if (employee.getId().equals(newEmployee.getId())) {
				employee.setFirstName(newEmployee.getFirstName());
				employee.setLastName(newEmployee.getLastName());
				return true;
			}
			
		}
 		return false;

		
	}
	

}
