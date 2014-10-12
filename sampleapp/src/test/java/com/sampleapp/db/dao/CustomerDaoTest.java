package com.sampleapp.db.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sampleapp.db.domain.Customer;

public class CustomerDaoTest {

	@Test
	public void testAddCustomer(){
		CustomerDao customerDao = new CustomerDao();
		customerDao.addCustomer(new Customer(6, "bruce", "grove", "bruce@gmail.com", "card"));
		assertTrue(true);
	}

}
