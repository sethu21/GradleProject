package Teacher;

import java.util.List;

public class TeacherDTO {
    private String TeacherId;
    private String TeacherName;
    private String TeacherLastname;
    private String Phone;
    private List<String> Subjects;

    // Constructor

    public TeacherDTO(String teacherId, String teacherName, String teacherLastname, String phone, List<String> subjects) {
        TeacherId = teacherId;
        TeacherName = teacherName;
        TeacherLastname = teacherLastname;
        Phone = phone;
        Subjects = subjects;
    }

    public String getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(String teacherId) {
        TeacherId = teacherId;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getTeacherLastname() {
        return TeacherLastname;
    }

    public void setTeacherLastname(String teacherLastname) {
        TeacherLastname = teacherLastname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "TeacherId='" + TeacherId + '\'' +
                ", TeacherName='" + TeacherName + '\'' +
                ", TeacherLastname='" + TeacherLastname + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Subjects=" + Subjects +
                '}';
    }
}

