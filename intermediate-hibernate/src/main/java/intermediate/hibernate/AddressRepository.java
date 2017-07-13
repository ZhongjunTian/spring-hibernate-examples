package intermediate.hibernate;

import intermediate.hibernate.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhongjun on 7/12/17.
 */
public interface AddressRepository extends JpaRepository<Address,Long> {
}
