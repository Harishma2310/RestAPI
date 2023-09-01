package com.excercise.renovating_products.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excercise.renovating_products.entity.Customer;
import com.excercise.renovating_products.service.CustomerService;


@RestController

public class CustController {
	Logger logger = LoggerFactory.getLogger(CustController.class);
	@Autowired
	CustomerService customerService;
	@GetMapping("/showcust")
	public List<Customer> showProducts()
	{
		return customerService.getproducts();
	}
	@PostMapping("/postcust")
	public List<Customer> putProducts(@RequestBody List<Customer> products)
	{
		return customerService.saveinfo(products);
	}
	@GetMapping(path="/loggerdemo")
	public String loggerDemo() {
		logger.info("Logger info");
		logger.warn("Logger warn");
		logger.error("logger error");
		return "Hello from logger demo";
	}

}
