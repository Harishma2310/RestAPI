package com.excercise.renovating_products.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.excercise.renovating_products.entity.Products;

public interface ProductRepository  extends JpaRepository<Products, Integer>{
	@Query(value="select p from Products_Table p",nativeQuery = true)
	public List<Products> show();

}
