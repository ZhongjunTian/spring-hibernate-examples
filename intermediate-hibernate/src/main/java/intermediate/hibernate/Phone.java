package intermediate.hibernate;

import javax.persistence.*;

/**
 * Created by zhongjun on 7/7/17.
 */
@Entity
public class Phone {
    @Id
    @GeneratedValue
    Long id;

    String number;

    Long personId;

    @ManyToOne
    @JoinColumn(name = "personId", insertable = false, updatable = false)
    Person owner;
}
