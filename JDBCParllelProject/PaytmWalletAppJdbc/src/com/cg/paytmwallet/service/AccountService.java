package com.cg.paytmwallet.service;

import com.cg.paytmwallet.bean.Account;
import com.cg.paytmwallet.exception.AccountException;

public interface AccountService {
String createAccount(Account account) throws AccountException;
double showBalance(String mobileNo) throws AccountException;
double deposit(String mobileNo,double amount) throws AccountException;
double withdraw(String mobileNo,double amount) throws AccountException;
boolean fundTransfer(String mobileNo1,String mobileNo2,double amount) throws AccountException;
Account printTransactions(String mobileNo) throws AccountException;

}
