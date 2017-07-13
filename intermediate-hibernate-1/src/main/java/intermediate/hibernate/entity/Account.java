package intermediate.hibernate.entity;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by jtian on 7/13/2017.
 */
@Entity
public class Account {
    @Id
    @GeneratedValue
    public Long id;

    public BigDecimal balance;//余额

    public static Account createAccount(){
        Account acct = new Account();
        acct.balance = BigDecimal.valueOf(Math.random());
        return acct;
    }
    @Override
    public String toString(){
        return new ToStringCreator(this)
                .append("id", id)
                .append("balance", balance)
                .toString();
    }
}
