package com.hibernate.cache.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    @Id
    private Integer courseId;
    private String name;

    private String subject;

    private Double price;
}
