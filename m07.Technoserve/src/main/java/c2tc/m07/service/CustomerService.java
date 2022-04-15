package c2tc.m07.service;

import java.util.List;

import c2tc.m07.entity.Customer;

public interface CustomerService 
{
	public void addCustomer(Customer c);
	public int deleteCustomer(int id);
	public Customer updateCustomer(Customer c);
	public Customer getCustomer(int id);
	public List<Customer> getCustomer();
	

	
}
