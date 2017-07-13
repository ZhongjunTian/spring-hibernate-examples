package intermediate.hibernate;

import intermediate.hibernate.entity.Address;
import intermediate.hibernate.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhongjun on 7/13/17.
 */
@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;
    @Transactional
    //one to one relationship
    public void personWithAddress() {
        //
        Person person = Person.createPerson();
        personRepository.save(person);
        System.out.println(person);// id 会自动生成 1
        person = personRepository.findOne(1L);

        Address address = Address.createAdress();
        addressRepository.save(address);
        System.out.println(address);// id 会自动生成 1

        person.addressId = address.id;
        person.homeAddress = address;
        personRepository.save(person);

        person = personRepository.findOne(1L);
        System.out.println(person.homeAddress);// id 会为 2, address
        System.out.println(person.phones);// id 会为 2, address
    }


    //one to many relationship
    public void personWithPhones() {

    }

}

