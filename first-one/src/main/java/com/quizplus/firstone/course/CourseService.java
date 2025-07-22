package com.quizplus.firstone.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
       List<Course> courses = new ArrayList<>();
       courseRepository.findAll().forEach(course ->courses.add(course)  );
        return  courses;
    }
    public Course getCourseById(String id) {
        return courseRepository.findById(id).get();
    }
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
