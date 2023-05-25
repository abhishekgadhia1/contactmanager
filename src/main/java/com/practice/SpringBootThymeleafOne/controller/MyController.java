package com.practice.SpringBootThymeleafOne.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model)
	{
		System.out.println("inside about handler");
		model.addAttribute("name","Abhishek G");
		model.addAttribute("currentDate", new Date(0).toLocaleString());
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model m)
	{
		
		List<String> names = List.of("abhishek","ag","abhi");
		m.addAttribute("names", names);
		return "iterate";
	}

}
