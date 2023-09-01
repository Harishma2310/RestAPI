package com.excercise.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excercise.day6.entity.ChildEntity;
import com.excercise.day6.service.ChildService;

@RestController
public class ChildController {
	@Autowired
	ChildService childService;
	@PostMapping("addall")
	public List<ChildEntity> addALL(@RequestBody List<ChildEntity> c){
		return childService.add(c);
	}
	@GetMapping("show")
	public List<ChildEntity> show(){
		return childService.show();
	}
	@PutMapping("modify")
	public ChildEntity update(ChildEntity c) {
		return childService.update(c);
	}
	@DeleteMapping("del/{id}")
	public String del(@PathVariable int id) {
		childService.deleteid(id);
		return "Deleted";
	}
	@GetMapping("show/{name}")
	public List<ChildEntity> sort(@PathVariable String  name){
		return childService.sortinfo(name);
	}
	@GetMapping("show/{pagno}/{pagesize}")
	public List<ChildEntity> getpage(@PathVariable int pagno,@PathVariable int pagesize){
		return childService.getbypage(pagno, pagesize);
	}
	@GetMapping("show/{pageno}/{pagesize}/{name}")
	public List<ChildEntity> getpagesort(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
		return childService.getbypagesort(pageno, pagesize, name);
	}

	}


