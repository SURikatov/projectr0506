package oseminar.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import oseminar.data.Teacher;

public class TeacherService {
    private final List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getAll() {
        return teachers;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, String subject, int experienceYears) {
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, subject, experienceYears);
        teachers.add(teacher);
    }
}