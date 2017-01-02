package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HomeController {


	 
	@RequestMapping("/")
	public ModelAndView showIndex() {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}
	
	@RequestMapping("/Login")
	public ModelAndView showLogin() {
		System.out.println("Login page");
 
		ModelAndView mv = new ModelAndView("Login");
		
		return mv;
	}
}
