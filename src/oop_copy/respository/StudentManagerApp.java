package oop_copy.respository;

import oop_copy.model.Student;
import java.util.List;

public interface StudentManagerApp {
    List<Student> findAll();
    Student findById(int id);
    void deleteById(int id);
    void save(Student s);
} 
