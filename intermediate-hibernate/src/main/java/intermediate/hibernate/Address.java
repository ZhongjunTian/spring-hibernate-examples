package intermediate.hibernate;

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

    //TODO
//    @OneToOne(fetch = FetchType.LAZY)
//    Person person;
}
