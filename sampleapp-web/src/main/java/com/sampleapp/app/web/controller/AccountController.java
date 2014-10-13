package com.sampleapp.app.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


@Controller
public class AccountController {

	@RequestMapping(value="/viewAccountDetails.html")
	public ModelAndView viewAccount(HttpSession session){
		ModelAndView model = new ModelAndView("AccountDetails");
		System.out.println("Session value = "+session.getAttribute("idValue"));
		return model;
	}
	
}
