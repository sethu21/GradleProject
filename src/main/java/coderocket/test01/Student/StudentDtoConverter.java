package coderocket.test01.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDtoConverter {
    private static int nextId = 1;
    public static StudentDto toDto(Students student) {
        String id = String.format("%s%02d", student.getName().substring(0, 3).toUpperCase(), nextId++);
        return new StudentDto(student.getName(), student.getLastname(), id);
    }

    public static Students toEntity(StudentDto dto) {
        return new Students(dto.getName(), dto.getLastname(), dto.getId());
    }

    public static List<StudentDto> toDtoList(List<Students> students) {
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Students student : students) {
            studentDtos.add(toDto(student));
        }
        return studentDtos;
    }

    public static List<Students> toEntityList(List<StudentDto> studentDtos) {
        List<Students> students = new ArrayList<>();
        for (StudentDto dto : studentDtos) {
            students.add(toEntity(dto));
        }
        return students;
    }
}
