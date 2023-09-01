package com.excercise.renovating_products.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excercise.renovating_products.entity.UserLogin;
import com.excercise.renovating_products.service.LoginService;

@RestController 
public class LoginController {
	@Autowired
	LoginService loginService;
	@PostMapping("/users")
	public boolean addUsers(@RequestBody UserLogin userLogin) {
		return loginService.AddUsers(userLogin);
	}
	@GetMapping("userslist")
	public List<UserLogin> getAllUsers(){
		return loginService.getUsers();
	}
	@GetMapping("/listusers/{emailId}")
	public Optional<UserLogin> getUsersById(@PathVariable int emailId){
		return loginService.getUsers(emailId);
	}
   

}
