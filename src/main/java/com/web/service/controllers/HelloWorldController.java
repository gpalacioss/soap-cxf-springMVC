package com.web.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.service.models.HelloWorld;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloworld")
	public String handler(Model model) {
		HelloWorld helloworld = new HelloWorld();
		
		helloworld.setMessage("probando aplicacion web");
		model.addAttribute("helloworld", helloworld);
		
		return "helloworld";
	}

}
