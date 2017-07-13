package basic.hibernate;

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

    @Lob
    String clob;

    public static Person createAccount() {
        Person person = new Person();
        person.name = "Foo";
        person.birthDate = new Date(System.currentTimeMillis());
        person.money = BigDecimal.valueOf(100);
        person.gender = 'M';
        person.gay = true;
        person.clob = "hello world";
        return person;
    }
}
