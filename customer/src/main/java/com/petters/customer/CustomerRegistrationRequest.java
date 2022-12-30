package com.petters.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {

}
