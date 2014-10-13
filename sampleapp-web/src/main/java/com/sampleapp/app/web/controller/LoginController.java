package com.sampleapp.app.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.*;

import com.sampleapp.app.web.model.Login;

@Controller
public class LoginController {

	@RequestMapping(value="/login.html", method=RequestMethod.GET)
	public ModelAndView loginForm(){
		return new ModelAndView("LoginForm");
	}
	
	@RequestMapping(value="/welcome.html", method=RequestMethod.POST)
	public ModelAndView loginSuccess(@ModelAttribute("login") Login login, HttpSession session){
		System.out.println("OUT> email address: "+login.getEmail());
		if(login.getEmail().equals("admin@admin.com") && login.getPassword().equals("admin")){
			session.setAttribute("idValue", new String("IDVALUE"));
			return new ModelAndView("Welcome");
		}
		else{
			return new ModelAndView("401Form");
		}

	}
	
}
