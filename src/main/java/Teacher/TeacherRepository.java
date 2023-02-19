package Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherRepository {
    private Map<String, Teacher> teachers;

    public TeacherRepository() {
        teachers = new HashMap<String, Teacher>();
    }

   /* public void save(Teacher teacher) {
        teachers.put(teacher.getId(), teacher);
    }*/

    public Teacher findById(String id) {
        return teachers.get(id);
    }

  /*  public void update(Teacher teacher) {
        teachers.replace(teacher.getId(), teacher);
    }

    public void delete(Teacher teacher) {
        teachers.remove(teacher.getId());
    }*/

    public List<Teacher> findAll() {
        return new ArrayList<Teacher>(teachers.values());
    }
}
