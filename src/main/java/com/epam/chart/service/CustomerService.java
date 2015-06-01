package com.epam.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.epam.chart.repository.Customer;

@Service
public class CustomerService {

	@Autowired
	private MongoTemplate customermongoTemplate;

	public void saveCustomer(Customer customer) {
		if (!customermongoTemplate.collectionExists(Customer.class)) {
			customermongoTemplate.createCollection(Customer.class);
		}
		customermongoTemplate.insert(customer, "customerTable");
	}

	public List<Customer> listCustomers() {
		return customermongoTemplate.findAll(Customer.class, "customerTable");
	}
}
