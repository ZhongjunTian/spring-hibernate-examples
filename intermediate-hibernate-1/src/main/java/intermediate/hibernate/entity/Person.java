package intermediate.hibernate.entity;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="PersonTable")
public class Person {
    @Id
    @GeneratedValue
    public Long id;

    public String name;
    //PersonTable表拥有account_id，而AccountTable表则没有person_id，这里与Address相反
    @OneToOne(cascade = CascadeType.ALL)
    public Account account;

    //AddressTable表拥有person_id
    @OneToOne(mappedBy = "owner")
    @JoinColumn
    public Address address;


    public static Person createPerson() {
        Person person = new Person();
        return person;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", id)
                .append("account", account)
                .append("address", address)
                .toString();
    }
}
