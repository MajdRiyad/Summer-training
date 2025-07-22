package com.quizplus.firstone.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/course")
    public List<Course> getAllCourse() {
        return courseService.getAllCourses();
    }
    @RequestMapping("/course/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourseById(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value = "/course")
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

}
