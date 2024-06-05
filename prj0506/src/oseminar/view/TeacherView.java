package oseminar.view;

import java.util.logging.Logger;
import oseminar.data.Teacher;

public class TeacherView {

    private static final Logger logger = Logger.getLogger(TeacherView.class.getName());

    public void displayTeacherDetails(Teacher teacher) {
        logger.info("Информация об учителе:");
        logger.info("Имя: " + teacher.getFirstName());
        logger.info("Дата рождения: " + teacher.getDateOfBirth());
        logger.info("Предмет: " + teacher.getSubject());
        logger.info("Опыт работы: " + teacher.getExperienceYears() + " лет");
    }
}
