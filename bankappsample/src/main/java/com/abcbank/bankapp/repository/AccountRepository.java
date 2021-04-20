package com.abcbank.bankapp.repository;

import com.abcbank.bankapp.model.Account;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    public List<Account> findByBalanceGreaterThanEqual(Double balance);

    public Optional<Account> findByAccountNumber(Long accountNumber);
}
