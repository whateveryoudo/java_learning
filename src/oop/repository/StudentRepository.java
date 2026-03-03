package oop.repository;

import oop.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();

    Student findById(int id);

    void save(Student student);

    void deleteById(int id);
}

