package com.abcbank.bankapp.service;

import com.abcbank.bankapp.config.ApplicationConfig;
import com.abcbank.bankapp.model.Account;
import com.abcbank.bankapp.model.Customer;
import com.abcbank.bankapp.repository.AccountRepository;
import com.abcbank.bankapp.repository.CustomerAccountRepository;
import com.abcbank.bankapp.repository.CustomerRepository;
import com.abcbank.bankapp.service.util.WSToEntityConverter;
import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BankingServiceImpl {

    @Autowired
    ApplicationConfig config;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerAccountRepository customerAccountRepository;

    @Autowired
    WSToEntityConverter converter;

    public ResponseEntity<Object> createNewAccount(AccountInformation accountInformation){

        Optional<Customer> customer = customerRepository.findByNameIgnoreCaseAndContactNumber(accountInformation.getName(), accountInformation.getContactNumber());
        if(customer.isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Customer already has account");
        }else {
            Customer newCustomer = customerRepository.save(converter.convertToCustomer(accountInformation));
            Account newAccount = accountRepository.save(converter.converToAccount(accountInformation));
            customerAccountRepository.save(converter.converToCustomerAccount(newCustomer,newAccount));
            if(config.getSaveInFile()) {
                try {
                    writeToFile(newCustomer, newAccount);
                }catch(IOException exception) {
                    exception.printStackTrace();
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to write to File");
                }
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("New Account Created successfully");
        }
    }

    public List<AccountInformation> getAccountDetails(Double balance) {
        List<AccountInformation> accounts = converter.convertToAccountInformation(accountRepository.findByBalanceGreaterThanEqual(balance));
        return accounts;
    }

    private void writeToFile(Customer customer, Account account) throws IOException {
        Path customerPath = Paths.get(config.getFilePath(),config.getCustomerFile().trim());
        Path accountPath = Paths.get(config.getFilePath(),config.getAccountFile().trim());
        Files.createDirectories(customerPath.getParent());

        if( !Files.exists(customerPath))
            Files.createFile(customerPath);
        if( !Files.exists(accountPath))
            Files.createFile(accountPath);

        Files.write(customerPath, customer.toString().getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        Files.write(accountPath, accountPath.toString().getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);

    }
}
