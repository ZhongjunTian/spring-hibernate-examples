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
    AccountRepository accountRepository;

    @Transactional  //one to one relationship
    public void oneToOneCascading1() {
        System.out.println("*******************开始");
        //先创建account
        Account account = Account.createAccount();

        //再把person绑定address
        Person person = Person.createPerson();
        person.account = account;

        person = personRepository.save(person);
        System.out.println("直接同时创建 person 和 account: "+person);//
    }

    @Transactional
    public void oneToOneCascading2() {
        System.out.println("*******************开始");
        //创建account
        Account account = Account.createAccount();
        account = accountRepository.save(account);

        System.out.println("先创建account: "+account);//
        //把person绑定address
        Person person = Person.createPerson();
        person.account = account;

        person = personRepository.save(person);
        System.out.println("再创建person, 同时绑定了前面的address: "+person);//
    }

    @Transactional
    public void oneToOneNocascading1() {
        System.out.println("*******************开始");
        //把person绑定address
        Person person = Person.createPerson();
        person = personRepository.save(person);
        System.out.println("先创建person: "+person);//

        //创建account
        Account account = Account.createAccount();
        account = accountRepository.save(account);
        System.out.println("再创建account: "+account);//

        person.account = account;
        person = personRepository.save(person);
        System.out.println("再更新person: "+person);//

    }


}

