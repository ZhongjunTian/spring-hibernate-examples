package com.jontian.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jtian on 6/19/2017.
 */
@SpringBootApplication
@Component
public class App implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    public void run(String... strings) throws Exception {
        System.out.println("Start!");
        //增
        Person person = Person.createAccount();
        personRepository.save(person);
        System.out.println();

        //查
        Person acct = personRepository.findAll().get(0);
        System.out.println(String.format("Person after creation: %s, %s, %s, %s, %s, %s",
                acct.id, acct.name, acct.birthDate, acct.money, acct.gender, acct.gay));

        //改
        acct.name = "newName";
        personRepository.save(acct);
        acct = personRepository.findAll().get(0);
        System.out.println("UserName after update: "+acct.name);

        //删
        personRepository.delete(acct);
        List<Person> people = personRepository.findAll();
        System.out.println("Size after deletion: "+ people.size());

    }

    public static void main(String args[]) {
        SpringApplication.run(App.class);
    }
}
