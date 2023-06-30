package com.hibernate.cache.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY, region="course")
public class Course {
    @Id
    private Integer courseId;
    private String name;

    private String subject;

    private Double price;
}
