package oop_copy.respository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oop_copy.model.Student;

public class InMemoryStudentRepository implements StudentManagerApp {
    List<Student> students = new ArrayList<>();

    @Override
    public List<Student> findAll() {
        return students;
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
    public void deleteById(int id) {
        // students.removeIf(s -> s.getId() == id);
        for (Iterator<Student> it = students.iterator(); it.hasNext();) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
            }
        }
    }

    @Override
    public void save(Student s) {
        Student existing = findById(s.getId());
        if (existing != null) {
            existing.setName(s.getName());
            existing.setAge(s.getAge());
            // if (students.contains(s)) {
            // modify
            // int targetIndex = students.indexOf(s);
            // Student targetStudent = students.get(s.getId());
            // targetStudent.setAge(s.getAge());
            // targetStudent.setName(s.getName());
            // students.set(targetIndex, targetStudent);

        } else {
            // add
            students.add(s);
        }
    }
}
