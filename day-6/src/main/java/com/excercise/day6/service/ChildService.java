package com.excercise.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.excercise.day6.entity.ChildEntity;
import com.excercise.day6.repository.ChildRepository;

@Service
public class ChildService {
	@Autowired
	ChildRepository childRepository;
	 public List<ChildEntity> add(List<ChildEntity> c){
		 return (List<ChildEntity>) childRepository.saveAll(c);
	 }
	 public List<ChildEntity> show(){
		 return childRepository.findAll();
	 }
	 public ChildEntity update(ChildEntity c) {
		 return childRepository.saveAndFlush(c);
	 }
	 public void deleteid(int id) {
		   childRepository.deleteById(id);
	 }
	 public List<ChildEntity> sortinfo(String s){
		 return childRepository.findAll(Sort.by(Sort.Direction.ASC, s));
	 }
	 public List<ChildEntity> getbypage(int pagno,int pagsize){
		 Page<ChildEntity> c=childRepository.findAll(PageRequest.of(pagno, pagsize));
		 return c.getContent();
	 }
	 public List<ChildEntity> getbypagesort(int pagno,int pagsize,String s){
		 Page<ChildEntity> c=childRepository.findAll(PageRequest.of(pagno,pagsize,Sort.by(Sort.Direction.DESC, s)));
		 return c.getContent();
	 }

}
