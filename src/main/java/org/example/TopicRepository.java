package org.example;

import CRUD.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//JPA will create the class for this interface
//CrudRepository interface contain all logic (such as select ,etc) for all Entity class
//different is type of Entity
//TopicRepository will add on other logic for Enity such as select with what condition
public interface TopicRepository extends CrudRepository<Topics,String>{
    Topics findByTopicsId(String topicId);
    void deleteTopic(String topicId);
}
