package com.hibernate.cache.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE,region ="course")
public class Course {

    @Id
    private Integer courseId;
    private String name;

    private String subject;

    private Double price;

//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//    List<Student> students;
}
