package com.hibernate.cache.repository;

import com.hibernate.cache.entity.Course;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    @Cacheable("myEntityCacheRegion")
    List<Course> findAll();
}
