package com.abcbank.bankapp;

import com.abcbank.bankapp.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class BankappApplication {

   public static void main(String[] args) {
        SpringApplication.run(BankappApplication.class, args);
    }
}
