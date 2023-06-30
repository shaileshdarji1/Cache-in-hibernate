package com.hibernate.cache.service.impl;

import com.hibernate.cache.entity.Course;
import com.hibernate.cache.repository.CourseRepository;
import com.hibernate.cache.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(Integer courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public Course update(Course course, Integer courseId) {
        Course course1 = courseRepository.findById(courseId).orElse(null);
         if(course1 !=null ){
             course1.setName(course.getName());
             course1.setSubject(course.getSubject());
             course1.setPrice(course.getPrice());
             return courseRepository.save(course1);
         }
         else{
             throw new RuntimeException("Course is not exits for "+ courseId);
         }
    }

    @Override
    public void delete(Integer courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        if(course !=null){
         courseRepository.delete(course);
        }
        else{
            throw new RuntimeException("Course is not exits for "+courseId);
        }
    }
}
