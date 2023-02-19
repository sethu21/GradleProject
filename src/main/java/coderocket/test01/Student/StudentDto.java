package coderocket.test01.Student;

import java.lang.constant.Constable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDto {
    private String id;
    private String name;
    private String Lastname;


    // Constructor
    public StudentDto(String id, String name, String Lastname) {
        this.id = id;
        this.name = name;
        this.Lastname = Lastname;

    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return Lastname;
    }



    // Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }
}
