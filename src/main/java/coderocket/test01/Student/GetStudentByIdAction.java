package coderocket.test01.Student;

import java.util.Scanner;

public class GetStudentByIdAction implements MainAction{
    private StudentService studentService;

    public GetStudentByIdAction(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ID of the student to retrieve: ");
        String id = scanner.nextLine();

        StudentDto student = studentService.getStudentById(id);

        if (student == null) {
            System.out.println("No student found with ID " + id);
        } else {
            System.out.println("Student details:");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Lastname: " + student.getLastname());
        }
    }
}
