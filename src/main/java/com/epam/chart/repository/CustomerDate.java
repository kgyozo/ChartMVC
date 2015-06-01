package com.epam.chart.repository;

import java.util.Date;

public class CustomerDate {
	public String name;
	public String address;
	private Date date;

	public CustomerDate(String name, String address, Date date) {
		super();
		this.name = name;
		this.address = address;
	}

	public CustomerDate() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
}
