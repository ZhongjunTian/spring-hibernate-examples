package com.jontian.hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "userName")
    String name;

    @Temporal(TemporalType.TIMESTAMP)
    Date birthDate;

    BigDecimal money;

    Character gender;

    @Transient
    boolean gay;

    public static Person createAccount() {
        Person acct = new Person();
        acct.name = "Foo";
        acct.birthDate = new Date(System.currentTimeMillis());
        acct.money = BigDecimal.valueOf(100);
        acct.gender = 'M';
        acct.gay = true;
        return acct;
    }
}
