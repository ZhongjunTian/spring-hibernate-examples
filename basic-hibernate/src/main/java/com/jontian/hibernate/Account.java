package com.jontian.hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Account {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "userName")
    String name;

    @Temporal(TemporalType.TIMESTAMP)
    Date birthDate;

    BigDecimal balance;

    Character gender;

    @Transient
    boolean bankrupt;

    public static Account createAccount() {
        Account acct = new Account();
        acct.name = "Foo";
        acct.birthDate = new Date(System.currentTimeMillis());
        acct.balance = BigDecimal.valueOf(-1);
        acct.gender = 'M';
        acct.bankrupt = true;
        return acct;
    }
}
