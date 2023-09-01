package com.excercise.renovating_products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.renovating_products.entity.UserLogin;

public interface LoginRepository extends JpaRepository<UserLogin, Integer> {
	

}
