package coderocket.test01.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  StudentRepository {
    private Map<String, Students> studentsMap;

    public StudentRepository() {
        studentsMap = new HashMap<>();
    }

    public Students save(Students student) {
        studentsMap.put(student.getId(), student);
        return student;
    }

    public Students findById(String id) {
        return studentsMap.get(id);
    }

    public List<Students> findAll() {
        return new ArrayList<>(studentsMap.values());
    }

    public Students update(Students student) {
        studentsMap.put(student.getId(), student);
        return student;
    }

    public void deleteById(String id) {
        studentsMap.remove(id);
    }
    public List<Students> findByName(String name) {
        List<Students> result = new ArrayList<>();
        for (Students student : studentsMap.values()) {
            if (student.getName().equals(name)) {
                result.add(student);
            }
        }
        return result;
    }

}
