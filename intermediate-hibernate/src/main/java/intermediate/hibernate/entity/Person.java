package intermediate.hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;

    Long addressId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId", insertable = false, updatable = false)
    Address homeAddress;

    @OneToMany(mappedBy = "person", cascade = CascadeType.REMOVE)
    List<Phone> phones;


    public static Person createAccount() {
        Person acct = new Person();

        return acct;
    }
}
