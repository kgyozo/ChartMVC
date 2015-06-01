package com.epam.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.epam.chart.repository.Customer;
import com.epam.chart.repository.CustomerDate;
import com.epam.chart.repository.Office;

@Service
public class CustomerService {

	@Autowired
	private MongoTemplate customermongoTemplate;

	@Autowired
	private MongoTemplate officemongoTemplate;

	public void saveCustomer(Customer customer) {
		if (!customermongoTemplate.collectionExists(Customer.class)) {
			customermongoTemplate.createCollection(Customer.class);
		}
		customermongoTemplate.insert(customer, "customerTable");
	}

	public List<Customer> listCustomers() {
		return customermongoTemplate.findAll(Customer.class, "customerTable");
	}

	public void saveCustomerDate(CustomerDate customer) {
		if (!customermongoTemplate.collectionExists(Customer.class)) {
			customermongoTemplate.createCollection(Customer.class);
		}
		customermongoTemplate.insert(customer, "customerDateTable");
	}

	public List<CustomerDate> listCustomersDate() {
		return customermongoTemplate.findAll(CustomerDate.class, "customerDateTable");
	}

	public List<Office> listOfficeHours() {
		List<Office> officehours = officemongoTemplate.findAll(Office.class, "myCollection"); 
		return officehours;
	}
}
