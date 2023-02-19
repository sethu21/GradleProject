package coderocket.test01.Student;

import java.util.List;
import java.util.Scanner;

public class FindStudentsByNameMainAction implements MainAction{
    private final StudentService studentService;

    public FindStudentsByNameMainAction(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        List<StudentDto> students = studentService.findStudentsByName(name);

        if (students.isEmpty()) {
            System.out.println("No students found with the name " + name);
        } else {
            System.out.println("Students with the name " + name + ":");
            for (StudentDto student : students) {
                System.out.println(student.getName() + " " + student.getLastname() + " (" + student.getId() + ")");
            }
        }
    }
}
