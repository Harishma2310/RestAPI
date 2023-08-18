package com.excercise.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AtValueAnnotations {
	@Value("${DefaultName}")
	private String DefaultName;
	@GetMapping("/display")
	public String getName()
	{
		return "My Name is "+DefaultName+" !!!"+" I AM LIVING IN BEAUTIFUL EARTH";
	}

}
