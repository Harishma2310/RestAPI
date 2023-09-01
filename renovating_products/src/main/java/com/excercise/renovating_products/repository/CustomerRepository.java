package com.excercise.renovating_products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.renovating_products.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
