package intermediate.hibernate;

import intermediate.hibernate.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jtian on 6/19/2017.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
