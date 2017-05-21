package com.quanpv.service;

import com.quanpv.dao.CustomerRepository;
import com.quanpv.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Iterable<Customer> getAll(){
        return repository.findAll();
    }

    public Customer getById(int id){
        return repository.findOne(id);
    }

    public void save(Customer product){
        repository.save(product);
    }

    public void delete(int id) {
        repository.delete(id);
    }

}
