package com.example.demo.dao;


import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT s FROM Student s WHERE s.name = ?1")// jpa query JQL .  HQL
    Student findByName(String name);

    Student findByEmail(String email);
}
