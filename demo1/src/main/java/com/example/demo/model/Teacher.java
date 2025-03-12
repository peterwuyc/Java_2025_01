package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Table(name = "teacher")
@Entity
@Data
public class Teacher {

    @Id
    private Integer id;
    @Column
    private String name;
    @ManyToMany(mappedBy = "teachers")
    @JsonIgnore
    private List<Student> students = new ArrayList<>();
}
