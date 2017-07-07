package intermediate.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "address_id")
    Long addressId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    Address address;

//    @OneToMany(cascade = CascadeType.REMOVE)
//    List<Phone> phones;


    public static Person createAccount() {
        Person acct = new Person();

        return acct;
    }
}
