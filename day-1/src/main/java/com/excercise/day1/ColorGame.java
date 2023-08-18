package com.excercise.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ColorGame {
	@RequestMapping("/")
	@ResponseBody
	public String myFavClr()
	{
		String yrFavClr="GREEN";
		return "MY FAVOURITE COLOR IS "+ yrFavClr+" !! ";
	}

}
