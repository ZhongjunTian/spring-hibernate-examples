package intermediate.hibernate.entity;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;

/**
 * Created by zhongjun on 7/7/17.
 */
@Entity(name = "AddressTable")
public class Address {
    @Id
    @GeneratedValue
    public Long id;

    public String city;

    @OneToOne
    @JoinColumn(name = "person_id") //如果没有这个就会认为外键为 PersonTable 表的 owner_id列
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
