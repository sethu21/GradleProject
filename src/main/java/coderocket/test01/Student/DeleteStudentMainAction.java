package coderocket.test01.Student;

import java.util.Scanner;

public class DeleteStudentMainAction implements MainAction{
    private final StudentService studentService;

    public DeleteStudentMainAction(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id to delete: ");
        String id = scanner.nextLine();

        studentService.deleteStudent(id);

        System.out.println("Student with id " + id + " has been deleted.");
    }
}
