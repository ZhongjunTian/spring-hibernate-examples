package intermediate.hibernate.entity;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;

/**
 * Created by zhongjun on 7/7/17.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue
    public Long id;

    public String city;

    @OneToOne(mappedBy = "homeAddress", fetch = FetchType.LAZY)
    public Person person;

    public static Address createAdress(){
        Address address = new Address();
        address.city = "beijing";
        return address;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", id)
                .append("city", city)
                .toString();
    }
}
