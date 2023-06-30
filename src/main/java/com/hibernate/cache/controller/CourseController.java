package com.hibernate.cache.controller;

import com.hibernate.cache.entity.Course;
import com.hibernate.cache.service.CourseService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    CourseService courseService;
    @GetMapping("/all")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PostMapping("/add")
    public Course save(@RequestBody Course course){
        return courseService.save(course);
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable("courseId") Integer courseId){
        courseService.getCourse(courseId);
        return courseService.getCourse(courseId);
    }

}
