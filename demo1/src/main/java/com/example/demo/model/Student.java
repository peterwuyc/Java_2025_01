package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Table(name = "student")
@Entity
@Data
public class Student implements Serializable {

    //private static final long serialVersionUID = 11243242341L;

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column
    private String address;
    @Column
    private String password;

    @OneToOne
    @JoinColumn(name = "card_id", referencedColumnName = "id")
    private Card card;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "student_teacher",
    joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private Set<Teacher> teachers = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "class_room_id")
    private ClassRoom classRoom;

    public Student() {

    }

    public Student(String name, String email, String address, Integer id) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
