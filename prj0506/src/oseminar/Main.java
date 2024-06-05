package oseminar;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Logger;

import oseminar.service.TeacherService;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();

        Scanner scanner = new Scanner(System.in);

        logger.info("Введите данные учителя:");

        logger.info("Имя:");
        String firstName = scanner.nextLine();

        logger.info("Фамилия:");
        String secondName = scanner.nextLine();

        logger.info("Отчество:");
        String patronymic = scanner.nextLine();

        logger.info("Дата рождения (гггг-мм-дд):");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        logger.info("Предмет:");
        String subject = scanner.nextLine();

        logger.info("Опыт работы (лет):");
        int experienceYears = Integer.parseInt(scanner.nextLine());

        teacherService.create(firstName, secondName, patronymic, dateOfBirth, subject, experienceYears);

        scanner.close();
    }
}
