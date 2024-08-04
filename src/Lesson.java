import model.Student;
import service.FileService;
import service.StudentService;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Lesson {
    public static final String URL = "test.txt";
    public static void main(String[] args) throws IOException {

        List<String> lines = FileService.read(URL);
        List<Student> students = StudentService.convert(lines);

        for(Student student : students) {
            System.out.println(student);
        }
        Student youngestStudent = Collections.max(students);

        FileService.writeStandardOpenOption(URL, "\nYoungest Student: " + youngestStudent.toString());


    }
}
