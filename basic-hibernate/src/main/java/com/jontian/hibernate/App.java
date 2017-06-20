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
public class App implements CommandLineRunner {

    @Autowired
    AccountRepository accountRepository;

    public void run(String... strings) throws Exception {
        System.out.println("Start!");
        //增
        Account account = Account.createAccount();
        accountRepository.save(account);
        System.out.println();

        //查
        Account acct = accountRepository.findAll().get(0);
        System.out.println(String.format("Account after creation: %s, %s, %s, %s, %s, %s",
                acct.id, acct.name, acct.birthDate, acct.balance, acct.gender, acct.bankrupt));

        //改
        acct.name = "newName";
        accountRepository.save(acct);
        acct = accountRepository.findAll().get(0);
        System.out.println("UserName after update: "+acct.name);

        //删
        accountRepository.delete(acct);
        List<Account> accounts = accountRepository.findAll();
        System.out.println("Size after deletion: "+ accounts.size());

    }

    public static void main(String args[]) {
        SpringApplication.run(App.class);
    }
}
