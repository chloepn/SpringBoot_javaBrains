package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
//        //business logic are declared in this method
//        // when access localhost:8080/topics, Spring MVC will access this method
//        // This method will return a list of objects
//        // MVC will convert this list to a JSON and the JSON is returned on View
//        return Arrays.asList(
//                new Topics("spring", "Spring framework", "Spring boot description"),
//                new Topics("spring", "Spring framework", "Spring boot description")
//        );
        return topicService.getAllTopics();
    }

//    @RequestMapping("/topics/{id}")
//    public Topics getTopic(@PathVariable String id){
//        return topicService.getTopic(id);
//    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topics topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topic){
        topicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id ){
        topicService.deleteTopic(id);
    }
}











