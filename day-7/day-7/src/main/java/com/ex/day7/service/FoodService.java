package com.ex.day7.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.day7.model.FoodModel;
import com.ex.day7.repository.FoodRepo;

@Service
public class FoodService {
	@Autowired
	public FoodRepo frepo;
	public String saveFood(FoodModel h)
	{
		frepo.save(h);
		return "Data is saved to database";
	}
	public List<FoodModel> getFood()
	{
		return frepo.findAll();
	}
	public FoodModel updateFood(FoodModel hm)
	{
		return frepo.saveAndFlush(hm);
	}
	public void deleteFood(int id)
	{
		System.out.println("Deleted");
		frepo.deleteById(id);
	}
	
	public boolean deletefoodinfo(int foodId)
	{
		if(frepo.existsById(foodId))
		{
			frepo.deleteById(foodId);
			return true;
		}
		return false;
	}
	
	public Optional<FoodModel> getUserId(int userId)
	   {
		   Optional<FoodModel>food=frepo.findById(userId);
		   if(food.isPresent())
		   {
			   return food;
		   }
		   return null;
	   }
	public List<FoodModel> sortByAsc(String name)
	{
		return frepo.findAll(org.springframework.data.domain.Sort.by(name).descending());
	}
	public List<FoodModel> getAllrows()
	{
		return frepo.getAllRows();
	}
	public List<FoodModel> getSpecrows(int id,String add,String name)
	{
		return frepo.getSpecRows(id,add,name);
	}
	public List<FoodModel> getByname(String name)
	{
		return frepo.getByname(name);
	}
	public int deleteRowByid(int id)
	{
		return frepo.deleteId(id);
	}
	public Integer updateRow(String addr,int id)
	{
		return frepo.updateByid(addr, id);
	}
			public List<FoodModel>getbyName(String d) 
			{ 
				return frepo.getByname(d); 
			}
			public Integer getBymodelid(int id)

			{
	   	       return frepo.hma(id);
		    }
			public int getByString(String add,int id)
			{
				return frepo.hmas(add,id);
			}
}