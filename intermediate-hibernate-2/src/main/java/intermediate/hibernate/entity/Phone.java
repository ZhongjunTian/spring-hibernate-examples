package intermediate.hibernate.entity;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.*;

/**
 * Created by zhongjun on 7/7/17.
 */
@Entity
public class Phone {
    @Id
    @GeneratedValue
    public Long id;

    public String number;

    Long personId;

    @ManyToOne
    @JoinColumn(name = "personId", insertable = false, updatable = false)
    Person person;

    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", id)
                .append("number", number)
                .append("personId", personId)
                .toString();
    }
}
