package oop.repository;

import oop.model.Student;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {

    private final List<Student> students = new ArrayList<>();

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        Student existing = findById(student.getId());
        if (existing == null) {
            students.add(student);
        } else {
            existing.setName(student.getName());
            existing.setAge(student.getAge());
        }
    }

    @Override
    public void deleteById(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}

