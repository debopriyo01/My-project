package com.greatlearning.springMvcdemo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String sayhello() {
		
		return "main-menu";
	}

}
