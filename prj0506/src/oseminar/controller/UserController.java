package oseminar.controller;

import java.time.LocalDate;

public interface UserController {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, String subject, int experienceYears);
}
