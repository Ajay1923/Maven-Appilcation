package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcontroller {
	
	@RequestMapping("index")
	public String index()
	{
		return"index.jsp";
		
	}

}
 
