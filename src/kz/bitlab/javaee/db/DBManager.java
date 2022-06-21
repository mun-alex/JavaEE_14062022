package kz.bitlab.javaee.db;

import kz.bitlab.javaee.models.Item;
import kz.bitlab.javaee.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static List<Student> studentList = new ArrayList<>();
    private static List<Item> itemList = new ArrayList<>();
    private static Long itemId = 1L;

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public void addItem(Item item) {
        item.setId(itemId);
        itemList.add(item);
        itemId++;
    }

    public List<Item> getAllItems() {
        return itemList;
    }
}
