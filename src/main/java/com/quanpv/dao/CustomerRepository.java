package com.quanpv.dao;

import com.quanpv.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
