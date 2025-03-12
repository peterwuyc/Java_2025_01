package com.example.demo.service;

import com.example.demo.dao.StudentRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTest {

    @Mock
    private StudentRepo studentRepo;
    @InjectMocks
    private StudentService studentService;

    @Test
    public void testFindByName() {

        // mock
        String email = studentService.getStudentEmailByName("Jack Ma");
        assertEquals("xxx@alibaba.com", email);
    }
}
