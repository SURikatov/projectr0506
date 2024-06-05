package oseminar.data;

import java.time.LocalDate;

public class Teacher extends User {
    private String subject;
    private int experienceYears;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, String subject, int experienceYears) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}