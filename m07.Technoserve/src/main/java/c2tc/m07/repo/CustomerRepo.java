package c2tc.m07.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import c2tc.m07.entity.Customer;

public interface CustomerRepo  extends 
JpaRepository<Customer, Integer>
//CrudRepository<Customers, Integer>
{


}
