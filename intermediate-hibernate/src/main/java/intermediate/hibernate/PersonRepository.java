package intermediate.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jtian on 6/19/2017.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
