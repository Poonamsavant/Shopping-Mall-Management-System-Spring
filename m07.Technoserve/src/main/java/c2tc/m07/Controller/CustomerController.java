package c2tc.m07.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import c2tc.m07.entity.Customer;
import c2tc.m07.service.CustomerService;



public class CustomerController 
{
	@Autowired
	CustomerService service;
	@RequestMapping("/addCustomer")
	public void addCustomer(@RequestBody  Customer c)
	{
		service.addCustomer(c);
	}
	@RequestMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable int id)
	{
		return service.getCustomer(id);
	}
	@GetMapping("/getCustomer")
	public List<Customer> getCustomer()
	{
		 return service.getCustomer();
	}
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer c)
	{
		return service.updateCustomer(c);
	}
	@DeleteMapping("/deleteCustomer/{id}")
	public int deleteCustomer(@PathVariable int id)
	{
		return service.deleteCustomer(id);
	}
}


