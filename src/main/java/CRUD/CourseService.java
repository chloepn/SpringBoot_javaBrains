package CRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicsId(topicId).forEach(t -> courses.add(t));
        return courses;
    }
    public List <Course> getCourse(String id){
        return courseRepository.findByCoursesId(id);
    }
    public void addCourse(Course course){
        courseRepository.save(course);
    }
    public void updateCourse(Course course){
        courseRepository.save(course);
    }
    public void deleteCourse(String id){
        courseRepository.deleteCourse(id);
    }

}
