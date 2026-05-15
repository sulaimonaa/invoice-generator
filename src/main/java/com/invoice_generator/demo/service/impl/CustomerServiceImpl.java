package com.invoice_generator.demo.service.impl;

import com.invoice_generator.demo.entity.Customer;
import com.invoice_generator.demo.repository.CustomerRepository;
import com.invoice_generator.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {

        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {

        return customerRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public Customer update(Long id, Customer customer) {

        Customer existing = getById(id);

        existing.setName(customer.getName());
        existing.setEmail(customer.getEmail());
        existing.setPhone(customer.getPhone());
        existing.setAddress(customer.getAddress());

        return customerRepository.save(existing);
    }

    @Override
    public void delete(Long id) {

        customerRepository.deleteById(id);
    }
}