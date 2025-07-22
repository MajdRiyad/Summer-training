package com.quizplus.firstone.user;

import com.quizplus.firstone.course.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher extends User{

    @ManyToMany
    @JoinTable(
            name = "Teacher_Course",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> Courses = new ArrayList<Course>();
    public Teacher(){}
    public Teacher(String id,String name){
        super(id,name);
    }
    public List<Course> getCourses() {
        return Courses;
    }
    public void setCourses(List<Course> courses) {
        this.Courses = courses;
    }
}
