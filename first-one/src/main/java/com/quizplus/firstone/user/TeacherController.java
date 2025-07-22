package com.quizplus.firstone.user;

import com.quizplus.firstone.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/teacher")
    public List<Teacher> teacher() {
        return teacherService.getAllTeachers();
    }
    @RequestMapping("/teacher/{id}")
    public Teacher teacher(@PathVariable String id) {
        return teacherService.getTeacherById(id);
    }


    @RequestMapping(method = RequestMethod.POST ,value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }
    @RequestMapping (method = RequestMethod.PUT,value = "/teacher/{id}")
    public void updateTeacher(@PathVariable String id, @RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/teacher/{id}")
    public void deleteTeacher(@PathVariable String id) {
        teacherService.deleteTeacher(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teacher/{id}/{course_id}")
    public void addCourse(@PathVariable String id, @PathVariable String course_id) {
        teacherService.addCourse(id, course_id);
    }


}
