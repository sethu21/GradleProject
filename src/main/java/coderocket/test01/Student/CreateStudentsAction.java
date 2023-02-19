package coderocket.test01.Student;

import java.util.Scanner;
import java.util.UUID;

public class CreateStudentsAction implements MainAction{
    private StudentService studentService;

    public CreateStudentsAction(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();


        System.out.println("Enter student Lastname:");
        String Lastname = scanner.nextLine();


        StudentDto studentDto = new StudentDto(" ",name,Lastname);
        studentDto = studentService.createStudent(studentDto);

        System.out.println("Student created with ID: " + studentDto.toString());
    }



}
