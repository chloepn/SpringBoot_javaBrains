package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
// these use JPA

    @Autowired
    private TopicRepository topicRepository;
    public List<Topics> getAllTopics(){
        List<Topics> topics = new ArrayList<>();
        topicRepository.findAll().forEach(t -> topics.add(t));
        return topics;
    }
    public Topics getTopic(String id){
        return topicRepository.findByTopicsId(id);
    }
    public void addTopic(Topics topic){
        topicRepository.save(topic);
    }
    public void updateTopic(Topics topic){
        topicRepository.save(topic);
    }
    public void deleteTopic(String id){
        topicRepository.deleteTopic(id);
    }
// these methods dont use JPA
//    private List<Topics> topics =  new ArrayList<>(Arrays.asList(
//            new Topics("spring", "Spring framework", "Spring boot description"),
//            new Topics("react", "reactJS framework", "ReactJS description")
//    ));
//
//    public List<Topics> getAllTopics(){
//        return topics;
//    }
//
//    public Topics getTopic(String id){
//        int index= 0;
//        while(index <= topics.size()){
//            if (topics.get(index).getId().equals(id)) {
//                break;
//            }else{
//                index++;
//            }
//        }
//        return index!=-1?topics.get(index): null;
////        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//    }
//
//    public void addTopic(Topics topic){
//        topics.add(topic);
//    }
//    public void updateTopic(Topics topic, String id){
//        int index= -1;
//        while(index <= topics.size()){
//            if (topics.get(index).getId().equals(id)) {
//                topics.set(index, topic);
//                break;
//            }else{
//                index++;
//            }
//        }
//    }
//    public void deleteTopic(String id){
//        int index= -1;
//        while(index <= topics.size()){
//            if (topics.get(index).getId().equals(id)) {
//                topics.remove(index);
//                break;
//            }else{
//                index++;
//            }
//        }
//    }
}
