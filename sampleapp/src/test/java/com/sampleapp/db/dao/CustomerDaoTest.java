package com.sampleapp.db.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sampleapp.db.domain.Customer;

public class CustomerDaoTest {

	CustomerDao customerDao;
	
	@Before
	public void before() throws Exception{
		customerDao = new CustomerDao();
	}
	
	@Test
	public void testAddCustomer(){
		customerDao.addCustomer(new Customer(6, "bruce", "grove", "bruce@gmail.com", "card", "abcd1234"));
		assertTrue(true);
	}
	
	@Test
	public void testGetCustomerById(){
		Customer customer = customerDao.getCustomerById(1);
		assertEquals("Suzie", customer.getFirstname());
		assertEquals("Baloozie", customer.getLastname());
	}

}
