package com.jontian.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jtian on 6/19/2017.
 */
@SpringBootApplication
@Component
public class App implements CommandLineRunner{
    public static void main(String args[]){
        SpringApplication.run(App.class);
    }

    @Autowired AccountRepository accountRepository;
    public void run(String... strings) throws Exception {
        List<Account> accts = accountRepository.findAll();
        System.out.println("******* total accounts: "+accts.size());
        accountRepository.save(new Account());
        accts = accountRepository.findAll();
        Account acct = accts.get(0);
        System.out.println("******* total accounts: "+accts.size());
        System.out.println(String.format("%s, %s, %s, %s, %s, %s",acct.id, acct.userName,acct.balance, acct.birthDate, acct.gender,acct.bankrupt));
    }
}
