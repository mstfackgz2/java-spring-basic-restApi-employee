package com.mstfackgz2.rest_api_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mstfackgz2.rest_api_demo.model.Employee;
import com.mstfackgz2.rest_api_demo.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/restApiDemo")
public class RestEmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping(path = "/get-all-employees")
	public List<Employee> getAllEmployeeList(){

		return employeeService.getAllEmployeeList();
	}
	
	@GetMapping(path = "/get-all-emplooyes/{id}")
	public Employee getEmployeeById(@PathVariable(name = "id",required = true)String id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping(path = "/get-employee-with-params")
	public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName",required = false) String firstName,
												@RequestParam(name = "lastName",required = false) String lastName){
		return employeeService.getEmployeeWithParams(firstName,lastName);
	}
	
	@PostMapping("/save-employee")
	public Employee saveEmployee(@RequestBody Employee newEmployee ) {
		return employeeService.saveEmployee(newEmployee);
	}
	
	@DeleteMapping("/delete-employee/{id}")
	public boolean deleteEmployee(@PathVariable(name = "id") String id) {
		
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/update-employee")
	public boolean updateEmployee(@RequestBody Employee newEmployee) {
		return employeeService.updateEmployee(newEmployee);
	}
	
	
	


}
