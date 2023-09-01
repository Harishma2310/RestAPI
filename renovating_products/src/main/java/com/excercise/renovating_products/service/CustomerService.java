package com.excercise.renovating_products.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.excercise.renovating_products.entity.Customer;
import com.excercise.renovating_products.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> getproducts() {
		return  customerRepository .findAll();
	}

	public List<Customer> saveinfo(List<Customer> product) {
		return  customerRepository.saveAll(product);
	}

	
}
