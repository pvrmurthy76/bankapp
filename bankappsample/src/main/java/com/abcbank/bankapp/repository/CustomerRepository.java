package com.abcbank.bankapp.repository;

import com.abcbank.bankapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Optional<Customer> findByNameIgnoreCaseAndContactNumber(String name, String contactNumber);
}
