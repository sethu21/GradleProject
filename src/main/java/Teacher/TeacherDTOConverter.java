package Teacher;

public class TeacherDTOConverter {

    private int nextId = 1; // Starting ID for the DTOs

    public TeacherDTO convertToDTO(Teacher teacher) {
        // Generate a unique ID using the first three letters of the teacher's name and a two-digit number
        String id = String.format("%s%02d", teacher.getTeacherName().substring(0, 3).toUpperCase(), nextId++);

        // Create a new TeacherDTO object with the generated ID and copy the properties from the Teacher object
        TeacherDTO teacherDTO = new TeacherDTO( id, teacher.getTeacherName(), teacher.getTeacherLastName(), teacher.getPhone(), teacher.getSubjects());
        return teacherDTO;
    }

    public Teacher convertToTeacher(TeacherDTO teacherDTO) {
        // Create a new Teacher object and copy the properties from the TeacherDTO object
        Teacher teacher = new Teacher(teacherDTO.getTeacherName(), teacherDTO.getTeacherLastname(), teacherDTO.getPhone(), teacherDTO.getSubjects());
        return teacher;
    }
}
