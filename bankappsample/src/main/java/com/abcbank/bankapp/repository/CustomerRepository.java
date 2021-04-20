package com.abcbank.bankapp.repository;

import com.abcbank.bankapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Optional<Customer> findByNameIgnoreCaseAndContactNumber(String name, String contactNumber);
}
