package com.aman.banking.account.event;

import com.aman.banking.account.bean.CustomerBean;

import lombok.Data;

@Data
public class AccountCreatedEvent {

    private String accountNumber;
    private String accountType;
    private double balance;
    private CustomerBean customerBean;

}