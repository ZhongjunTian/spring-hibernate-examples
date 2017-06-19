package com.jontian.hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity(name = "account")
public class Account {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "userName")
    String userName;

    Date birthDate;

    BigDecimal balance;

    Character gender;

    @Transient
    boolean bankrupt;

    public static Account createAccount(){
        Account acct = new Account();
        acct.userName = "Foo";
        acct.birthDate = new Date(System.currentTimeMillis());
        acct.balance = BigDecimal.valueOf(-1);
        acct.gender = 'M';
        acct.bankrupt = true;
        return acct;
    }
}
