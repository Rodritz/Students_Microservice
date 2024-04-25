package com.microservice.course.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String teacher;

}
