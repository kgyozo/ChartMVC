package com.epam.chart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.chart.repository.Customer;
import com.epam.chart.repository.Office;
import com.epam.chart.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomerList(ModelMap model) {
		model.addAttribute("customerList", customerService.listCustomers());
		return "customerdetails";
	}

	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Customer customer, ModelMap model) {
		customerService.saveCustomer(customer);
		return "redirect:/customer";
	}

	@RequestMapping(value = "/office", produces="application/json")
	public @ResponseBody List<Office> getOfficeList(/*ModelMap model*/) {
		List<Office> office = customerService.listOfficeHours();
		return office;
	}

}