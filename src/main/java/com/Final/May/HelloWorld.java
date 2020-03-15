package com.Final.May;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	
	@RequestMapping({ "/hello" })  
	public String String () {
		return "Hello World";
		
		
	}
}
