package intermediate.hibernate;

import intermediate.hibernate.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhongjun on 7/13/17.
 */
@Service
public class Demo {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    @Transactional

    //one to many relationship
    public void personWithPhones() {

    }

}

