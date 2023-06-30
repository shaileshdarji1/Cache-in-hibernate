package com.hibernate.cache.service;

import com.hibernate.cache.entity.Course;

import java.util.List;

public interface CourseService {
    public Course save(Course course);

    public List<Course> getCourses();

    public Course getCourse(Integer courseId);

    public Course update(Course course,Integer courseId);

    public void delete(Integer courseId);

}
