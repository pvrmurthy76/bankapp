package com.abcbank.bankapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties("bank")
public class ApplicationConfig {

    private String filePath;
    private String accountFile;
    private String customerFile;
    private Boolean saveInFile;


    public Boolean getSaveInFile() {
        return saveInFile;
    }

    public void setSaveInFile(Boolean saveInFile) {
        this.saveInFile = saveInFile;
    }

    public String getFilePath() {return filePath;}
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getAccountFile() {return accountFile;}
    public void setAccountFile(String accountFile) {
        this.accountFile = accountFile;
    }

    public String getCustomerFile() {return customerFile;}
    public void setCustomerFile(String customerFile){
        this.customerFile = customerFile;
    }

}
