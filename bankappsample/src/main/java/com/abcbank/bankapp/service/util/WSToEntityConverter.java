package com.abcbank.bankapp.service.util;

import com.abcbank.bankapp.model.*;
import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;
import com.abcbank.bankapp.wsapi.restfule.vo.AddressInformation;
import com.abcbank.bankapp.wsapi.restfule.vo.AmountTransfer;
import com.abcbank.bankapp.wsapi.restfule.vo.BankInformation;
import org.springframework.stereotype.Component;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class WSToEntityConverter {

    public Customer convertToCustomer(AccountInformation accountInformation) {
        Customer customer = new Customer();
        customer.setName(accountInformation.getName());
        customer.setContactNumber(accountInformation.getContactNumber());
        if(accountInformation.getCustomerAddress() != null )
         customer.setCustomerAddress(converToAddress(accountInformation.getCustomerAddress()));
        return customer;
    }

    public Account converToAccount(AccountInformation accountInformation) {
        Account account = new Account();
        account.setAccountNumber(accountInformation.getAccountNumber());
        account.setAccountType(accountInformation.getAccountType());
        account.setAccountStatus(accountInformation.getAccountStatus());
        account.setBalance(accountInformation.getBalance());
        account.setBankDetail(converToBankDetail(accountInformation.getBankInformation()));
        return account;

    }

    public BankDetail converToBankDetail(BankInformation bankInformation) {
        BankDetail bank = new BankDetail();
        bank.setBranchName(bankInformation.getBranchName());
        bank.setBranchCode(bankInformation.getBranchCode());
        bank.setBankAddress(converToAddress(bankInformation.getBranchAddress()));
        return bank;
    }
    public Address converToAddress(AddressInformation addressInformation) {
        Address address = new Address();
        address.setAddress1(addressInformation.getAddress1());
        address.setAddress2(addressInformation.getAddress2());
        address.setCity(addressInformation.getCity());
        address.setState(addressInformation.getState());
        address.setZip(addressInformation.getZip());
        address.setCountry(addressInformation.getCountry());
        return address;
    }

    public CustomerAccount converToCustomerAccount(Customer customer, Account account) {
        CustomerAccount customerAccount = new CustomerAccount();
        customerAccount.setCustomerId(customer.getId());
        customerAccount.setAccountId(account.getId());
        return customerAccount;

    }

    public List<AccountInformation> convertToAccountInformation(List<Account> accounts) {
        List<AccountInformation> accountInformations = new ArrayList<>();
        for(Account account: accounts) {
            accountInformations.add(accountEntityToAccountInformation(account));
        }
        return accountInformations;
    }

    public AccountInformation accountEntityToAccountInformation(Account account) {
        AccountInformation acct = new AccountInformation();
        acct.setAccountNumber(account.getAccountNumber());
        acct.setAccountStatus(account.getAccountStatus());
        acct.setAccountType(account.getAccountType());
        acct.setBalance(account.getBalance());
        return acct;
    }

    public Transaction createDebitTransaction(AmountTransfer amountTransfer) {
        Transaction transaction = new Transaction();
        transaction.setAccountNumber(amountTransfer.getFromAccountNumber());
        transaction.setTransactionAmount(amountTransfer.getAmount());
        transaction.setTransactionDateTime(new Date());
        transaction.setTransactionType("DEBIT");
        return transaction;
    }

    public Transaction createCreditTransaction(AmountTransfer amountTransfer) {
        Transaction transaction = new Transaction();
        transaction.setAccountNumber(amountTransfer.getToAccountNumber());
        transaction.setTransactionAmount(amountTransfer.getAmount());
        transaction.setTransactionDateTime(new Date());
        transaction.setTransactionType("CREDIT");
        return transaction;
    }
}
