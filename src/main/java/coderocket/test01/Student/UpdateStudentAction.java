package coderocket.test01.Student;

import java.util.Scanner;

public class UpdateStudentAction implements MainAction{
    private StudentService studentService;
    private StudentRepository studentRepository;

    public UpdateStudentAction(StudentService studentService) {
        this.studentService = new StudentService(studentRepository);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the student to update: ");
        String id = scanner.nextLine();

        System.out.print("Enter the new name of the student: ");
        String name = scanner.nextLine();

        System.out.print("Enter the new last name of the student: ");
        String lastName = scanner.nextLine();

        StudentDto studentDto = new StudentDto(name, lastName,id);
        StudentDto updatedStudentDto = studentService.updateStudent(id, studentDto);

        if (updatedStudentDto != null) {
            System.out.println("Student updated: " + updatedStudentDto.getName() + " " + updatedStudentDto.getLastname());
        } else {
            System.out.println("Could not update student with ID " + id);
        }
    }
}
