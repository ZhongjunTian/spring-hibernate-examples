package intermediate.hibernate;

import intermediate.hibernate.entity.Account;
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
    AccountRepository addressRepository;
    @Transactional
    //one to one relationship
    public void oneToOneCascading() {
        //先创建account
        Account account = Account.createAccount();

        //再把person绑定address
        Person person = Person.createPerson();
        person.account = account;

        personRepository.save(person);
        System.out.println(person);// owner.id 会自动生成 1
        person = personRepository.findOne(1L);
        personRepository.delete(1L);
    }

    public void oneToOneNoCascading(){

    }

}

