package com.abcbank.bankapp.repository;

import com.abcbank.bankapp.model.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {
}
