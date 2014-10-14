package com.sampleapp.app.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import com.sampleapp.db.dao.CustomerDao;
import com.sampleapp.db.domain.Customer;

@Controller
public class AccountController {

	@RequestMapping(value="/viewAccountDetails.html")
	public ModelAndView viewAccount(HttpSession session){
		ModelAndView model = new ModelAndView("AccountDetails");
		Customer customerObject = (Customer) session.getAttribute("customerObject");
		model.addObject("customer", customerObject);
		return model;
	}
	
	@RequestMapping(value="/viewAllAccounts.html")
	public ModelAndView getAllAccounts(){
		List<Customer> customerList = new CustomerDao().getAllCustomers();
		ModelAndView model = new ModelAndView("ViewAccounts");
		model.addObject("customerList", customerList);
		return model;
	}
	
	@RequestMapping(value="/createNewAccount.html")
	public ModelAndView createNewAccount(@ModelAttribute("customer") Customer customer){
		ModelAndView model = new ModelAndView("CreateNewAccount");
		return model;
	}
	
	@RequestMapping(value="/result.html")
	public ModelAndView viewResult(@ModelAttribute("customer") Customer customer){
		ModelAndView model = new ModelAndView("Result");
		CustomerDao customerDao = new CustomerDao();
		customer.setId(customerDao.getNumberOfCustomers() + 1);
		customerDao.addCustomer(customer);
		return model;
	}
}
