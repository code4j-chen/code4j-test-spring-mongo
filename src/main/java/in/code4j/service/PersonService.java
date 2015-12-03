package in.code4j.service;

import in.code4j.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author chenlihua
 * @date 2015/12/3
 * @time 14:38
 */
public interface PersonService {
    Person save(Person person);
    Page<Person> findByAgeGreaterThan(int age, Pageable page);
}
