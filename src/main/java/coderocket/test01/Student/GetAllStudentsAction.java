package coderocket.test01.Student;

import java.util.List;

public class GetAllStudentsAction implements MainAction {
    private StudentService studentService;

    public GetAllStudentsAction(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        List<StudentDto> studentDtos = studentService.getAllStudents();
        for (StudentDto studentDto : studentDtos) {
            System.out.println(studentDto.toString());
        }

    }
}
