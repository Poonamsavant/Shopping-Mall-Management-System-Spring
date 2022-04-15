package c2tc.m07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import c2tc.m07.entity.Customer;
import c2tc.m07.repo.CustomerRepo;

public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	CustomerRepo cr;

	@Override
	public void addCustomer(Customer c) 
	{
		cr.save(c);
	}

	@Override
	public int deleteCustomer(int id) 
	{
		Customer c = cr.findById(id).get();
		cr.delete(c);
		return 1;
	}

	@Override
	public Customer updateCustomer(Customer c)
	{
		Customer c1 =cr.save(c);
		return c1;
	}

	@Override
	public Customer getCustomer(int id) 
	{
		Customer c = cr.findById(id).get();
		
		return c;
	}

	@Override
	public List<Customer> getCustomer() 
	{
		List<Customer> list = cr.findAll();
		return list;
	}

	
}
