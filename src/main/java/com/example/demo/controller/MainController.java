package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	private static Map<String,String> loginMap = new HashMap<>();
	{
		loginMap.put("user","password");
	}
	@RequestMapping("/processLogin")
	public String index(LoginEntity login,Model model) {
		System.out.println(login);
		if(login.getUsername().equals("username") && login.getPassword().equals("password")) {
			System.out.println("1-------------");
			model.addAttribute("success",true);
			
		}else {
			model.addAttribute("success",false);
			System.out.println("2-------------");
		}
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		
		return "index";
	}
	
}
