package com.petters.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {

  public void registerCustomer(CustomerRegistrationRequest customerRequest) {
    Customer customer = Customer.builder()
        .firstName(customerRequest.firstName())
        .lastName(customerRequest.lastName())
        .email(customerRequest.email())
        .build();

  }
}
