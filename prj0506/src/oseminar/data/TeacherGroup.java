package oseminar.data;

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
