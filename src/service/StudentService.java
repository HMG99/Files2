package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public static List<Student> convert(List<String> lines) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            Student student = new Student(lines.get(i));
            students.add(student);
        }
        return students;
    }

    public static Student YoungestStudent(List<Student> students) {
        Student youngest = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getYear() > youngest.getYear()) {
                youngest = students.get(i);
            }
        }
        return youngest;
    }

}
