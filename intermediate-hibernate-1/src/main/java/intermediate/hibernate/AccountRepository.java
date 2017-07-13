package intermediate.hibernate;

import intermediate.hibernate.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jtian on 7/13/2017.
 */
public interface AccountRepository extends JpaRepository<Account,Long> {
}
