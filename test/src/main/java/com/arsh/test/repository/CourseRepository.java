package com.arsh.test.repository;

import com.arsh.test.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    void getIdofCourse(int id);
}
