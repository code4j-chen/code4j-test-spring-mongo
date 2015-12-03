package in.code4j.service.impl;

import com.alibaba.fastjson.JSON;
import in.code4j.entity.Person;
import in.code4j.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author chenlihua
 * @date 2015/12/3
 * @time 14:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PersonServiceImplTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testSave() throws Exception {
        Person p = new Person(123456, "John", "Kaly", 25);
        Person save = personService.save(p);
        assertNotNull(save);
    }

    @Test
    public void testFindByAgeGreaterThan() throws Exception {
        Pageable pageable = new PageRequest(0, 10);
        Page<Person> page = personService.findByAgeGreaterThan(23, pageable);
        System.out.println(JSON.toJSONString(page.getContent(), true));
        int totalPages = page.getTotalPages();
        System.out.println("totalPages = " + totalPages);
        assertTrue(totalPages == 1);
        page = personService.findByAgeGreaterThan(25, pageable);
        assertTrue(page.getTotalPages() == 0);
    }
}