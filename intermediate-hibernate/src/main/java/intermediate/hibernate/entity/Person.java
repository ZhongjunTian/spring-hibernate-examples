package intermediate.hibernate.entity;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    public Long id;

    public Long addressId;

    @OneToOne
    @JoinColumn(name = "addressId", insertable = false, updatable = false)
    public Address homeAddress;

    //@OneToMany(fetch = FetchType.LAZY,  mappedBy = "person", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Phone> phones = new ArrayList<>();


    public static Person createPerson() {
        Person person = new Person();
        return person;
    }

    @Override
    public String toString() {
        return phones.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
