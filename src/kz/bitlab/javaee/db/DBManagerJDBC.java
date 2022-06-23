package kz.bitlab.javaee.db;

import kz.bitlab.javaee.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManagerJDBC {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lesson3?useUnicode=true&serverTimezone=UTC","root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(Student student) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "insert into students (id, name, surname, birthdate, city) values (null, ?, ?, ?, ?)");
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getBirthday());
            statement.setString(4, student.getCity());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from students");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String birthdate = resultSet.getString("birthdate");
                String city = resultSet.getString("city");
                studentList.add(new Student(id, name, surname, birthdate, city));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
