package kz.bitlab.javaee.db;

import kz.bitlab.javaee.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }
}
