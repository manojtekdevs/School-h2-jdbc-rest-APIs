// Write your code here
package com.example.school.repository;

import java.util.*;

import com.example.school.model.Student;

public interface StudentRepository {

    ArrayList<Student> getStudents();

    Student addStudent(Student student);

    String addStudents(ArrayList<Student> students);

    Student getStudentById(int studentId);

    Student updateStudentDetails(int studentId, Student student);

    void deleteStudent(int studentId);
}
