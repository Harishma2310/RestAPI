package com.excercise.day_3.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.day_3.Models.Employee;
import com.excercise.day_3.Repositories.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ApiService {
	@Autowired
EmployeeRepo repo;
	
	public boolean AddEmployee(Employee emp) {
		repo.save(emp);
		return true;
	}
	public List<Employee> getEmployee(){
		return repo.findAll();
	}
	public Optional<Employee> getEmployeeId(int id){
		return repo.findById(id);
	}

}
