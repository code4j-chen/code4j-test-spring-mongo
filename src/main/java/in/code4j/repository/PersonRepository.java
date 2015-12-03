package in.code4j.repository;

import in.code4j.entity.Person;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author chenlihua
 * @date 2015/12/3
 * @time 14:35
 */
public interface PersonRepository extends MongoRepository<Person, ObjectId> {
    //查询大于age的数据
    Page<Person> findByAgeGreaterThan(int age, Pageable page);

}
