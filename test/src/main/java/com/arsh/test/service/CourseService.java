package com.arsh.test.service;

import com.arsh.test.model.Course;
import com.arsh.test.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    @Autowired

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public void getIdofCourse(int id) {

        courseRepository.getIdofCourse(id);
    }
}
