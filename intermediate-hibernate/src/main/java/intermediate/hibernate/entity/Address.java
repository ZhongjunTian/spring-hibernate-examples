package intermediate.hibernate.entity;

import javax.persistence.*;

/**
 * Created by zhongjun on 7/7/17.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue
    Long id;

    String city;

    @OneToOne(mappedBy = "homeAddress", fetch = FetchType.LAZY)
    Person person;
}
