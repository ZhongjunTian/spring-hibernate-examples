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

    @OneToOne
    //@JoinColumn(name = "person_id") //默认就会认为外键为 address.person_id
    public Person owner;

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
