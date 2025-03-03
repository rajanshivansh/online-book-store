package com.onlinebookstore.controller;

import com.onlinebookstore.forms.entity.CustomerData;
import com.onlinebookstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
	
	@Autowired
	private CustomerService theCustomerService;
	
	@GetMapping("/register")
	public String showRegisterForm(Model theModel) {
		theModel.addAttribute("customerData", new CustomerData());
		return "register-customer";
	}
	
	@PostMapping("/register/customer")
	public String processCustomerRegistration(@ModelAttribute CustomerData theCustomerData, Model theModel) {
		
		String message = theCustomerService.registerCustomer(theCustomerData);
		
		theModel.addAttribute("message",message);

		return "register-customer";
	}

}
