package in.code4j.service.impl;

import in.code4j.entity.Person;
import in.code4j.repository.PersonRepository;
import in.code4j.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author chenlihua
 * @date 2015/12/3
 * @time 14:39
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Page<Person> findByAgeGreaterThan(int age, Pageable page) {
        return personRepository.findByAgeGreaterThan(age, page);
    }
}
