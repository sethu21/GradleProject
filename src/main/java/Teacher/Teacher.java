package Teacher;

import lombok.Value;

import java.util.List;


public class Teacher {
   private String TeacherName;
   private String TeacherLastName;
   private String Phone;
   private List<String>Subjects;

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getTeacherLastName() {
        return TeacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        TeacherLastName = teacherLastName;
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

    public Teacher(String teacherName, String teacherLastName, String phone, List<String> subjects) {
        TeacherName = teacherName;
        TeacherLastName = teacherLastName;
        Phone = phone;
        Subjects = subjects;
    }
}
