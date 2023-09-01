package com.excercise.renovating_products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.renovating_products.entity.UserLogin;
import com.excercise.renovating_products.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	public boolean AddUsers(UserLogin userLogin) {
		loginRepository.save(userLogin);
		return true;
	}
	public List<UserLogin> getUsers(){
		return loginRepository.findAll();
	}
	public Optional<UserLogin> getUsers(int emailId){
		return loginRepository.findById(emailId);
	}

	

}
