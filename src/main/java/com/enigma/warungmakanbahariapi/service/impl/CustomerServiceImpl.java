package com.enigma.warungmakanbahariapi.service.impl;

import com.enigma.warungmakanbahariapi.entity.Customer;
import com.enigma.warungmakanbahariapi.repository.CustomerRepository;
import com.enigma.warungmakanbahariapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(Customer customer) {
        customerRepository.save(customer);
    }
}