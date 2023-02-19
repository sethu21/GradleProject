package coderocket.test01.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDto createStudent(StudentDto studentDto) {

        Students student = StudentDtoConverter.toEntity(studentDto);
        student.setId(UUID.randomUUID().toString());
        student = studentRepository.save(student);
        return StudentDtoConverter.toDto(student);
    }

    public StudentDto getStudentById(String id) {
        Students student = studentRepository.findById(id);
        if (student != null) {
            return StudentDtoConverter.toDto(student);
        }
        return null;
    }

    public List<StudentDto> getAllStudents() {
        List<Students> students = studentRepository.findAll();
        return StudentDtoConverter.toDtoList(students);
    }

    public StudentDto updateStudent(String id, StudentDto studentDto) {
        Students existingStudent = studentRepository.findById(id);
        if (existingStudent != null) {
            Students updatedStudent = StudentDtoConverter.toEntity(studentDto);
            updatedStudent.setId(existingStudent.getId());
            updatedStudent = studentRepository.update(updatedStudent);
            return StudentDtoConverter.toDto(updatedStudent);
        }
        return null;
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public List<StudentDto> findStudentsByName(String name) {
        List<Students> students = studentRepository.findByName(name);
        return StudentDtoConverter.toDtoList(students);
    }
    /*public List<Students> addStudents(List<StudentDto> studentDtos) {
        List<Students> students = StudentDtoConverter.toEntityList(studentDtos);
        for (Students student : students) {
            studentRepository.save(student);
        }
        return students;
    }

}

     */
}
