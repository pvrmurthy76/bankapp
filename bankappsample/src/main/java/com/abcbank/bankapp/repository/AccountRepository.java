package com.abcbank.bankapp.repository;

import com.abcbank.bankapp.model.Account;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    public List<Account> findByBalanceGreaterThanEqual(Double balance);
}
