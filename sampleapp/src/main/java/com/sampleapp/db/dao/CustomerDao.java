package com.sampleapp.db.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sampleapp.db.controller.FileController;
import com.sampleapp.db.domain.Customer;

public class CustomerDao {

	public CustomerDao(){}

	public List<Customer> getAllCustomers(){
		List<Customer> customerList = new ArrayList<Customer>();
		FileController fc = new FileController();
		fc.readFile();
		List<String> recordList = fc.getRecords();
		for (Iterator<String> it = recordList.iterator(); it.hasNext();){
			String[] recordFields = it.next().split(", ");
			Customer customer = new Customer(Integer.parseInt(recordFields[0]), recordFields[1], recordFields[2], recordFields[3], recordFields[4], recordFields[5]);
			customerList.add(customer);
		}
		return customerList;
	}
	
	public Customer getCustomerById(int id){
		Customer customer = null;
		FileController fc = new FileController();
		fc.readFile();
		List<String> recordList = fc.getRecords();
		for (Iterator<String> it = recordList.iterator(); it.hasNext();){
			String[] recordFields = it.next().split(", ");
			if(Integer.parseInt(recordFields[0]) == id){
				customer = new Customer(Integer.parseInt(recordFields[0]), recordFields[1], recordFields[2], recordFields[3], recordFields[4], recordFields[5]);
				return customer;	
			}
			
		}
		return customer;
	}
	
	public void addCustomer(Customer customer){
		FileController fc = new FileController();
		fc.writeToFile(customer.toString());
	}
	
	
}
