package intermediate.hibernate;

import javax.persistence.*;

/**
 * Created by zhongjun on 7/7/17.
 */
//@Entity
public class Phone {
    @Id
    @GeneratedValue
    Long id;

    String number;

    Long personId;

    @ManyToOne
    @JoinColumn(name = "person_id"
            //,foreignKey = @ForeignKey(name = "PERSON_ID_FK")
    )
    Person owner;
}
