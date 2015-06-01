package com.epam.chart.controller;

import orders.Order;
import orders.db.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BaseController {
 
	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	
	//@Autowired
//	private OrderRepository repo;

//	@Autowired MongoOperations mongoOps;

 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
 
		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		
		Order order = new Order();
		order.setCustomer("cust");
		order.setType("type");
//		repo.insert(order);
 
		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;
 
	}
 
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		return VIEW_INDEX;
 
	}
 
}