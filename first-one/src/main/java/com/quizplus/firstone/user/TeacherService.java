package com.quizplus.firstone.user;

import com.quizplus.firstone.course.Course;
import com.quizplus.firstone.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teacherRepository.findAll().forEach(t->teachers.add(t));
        return teachers;
    }

    public Teacher getTeacherById(String id) {
        return teacherRepository.findById(id).get();
    }

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
    public void addCourse(String teacher_id ,String course_id) {
    Teacher teacher = teacherRepository.findById(teacher_id).get();
    Course course = courseRepository.findById(course_id).get();
    teacher.getCourses().add(course);
    course.getTeachers().add(teacher);
    teacherRepository.save(teacher);

    }
    public void updateTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(String id) {
        teacherRepository.deleteById(id);
    }


}
