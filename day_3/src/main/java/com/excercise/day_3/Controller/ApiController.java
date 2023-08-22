package com.excercise.day_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ApiController {
	@Autowired
	ApiService service;
	@PostMapping("/emp")
	public boolean addEmployee(@RequestBody Employee emp)
	{
		return service.AddEmployee(emp);
	}
@GetMapping("/emp")
		public List<Employee> getAllEmployees()
		{
	return service.getEmployee();
		}
@GetMapping("/emp/{id}")
public optional<Employee> getEmployeeById(@PathVariable int id)
{
	return service.getemployeeId(id);
}
}
