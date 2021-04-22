package com.abcbank.bankapp.controller;

import com.abcbank.bankapp.wsapi.restfule.vo.AccountInformation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/updatedetails")
    public ResponseEntity<Object> updateCustomerDetails(@Valid @RequestBody AccountInformation accountInformation ) {
       //TODO
        return ResponseEntity.status(HttpStatus.OK).body("Contact Details updated Successfully ");
    }
    @PostMapping("/customeraccount")
    public AccountInformation getCustomerAccountDetails(@RequestParam Long customerNumber) {
        //TODO
        AccountInformation information = new AccountInformation();
        return information;
    }
}
