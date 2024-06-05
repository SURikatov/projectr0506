package oseminar.controller;

import java.time.LocalDate;

import oseminar.service.TeacherService;

public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, String subject, int experienceYears) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth, subject, experienceYears);
    }
}