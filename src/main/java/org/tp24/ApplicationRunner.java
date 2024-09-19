package org.tp24;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;

public class ApplicationRunner {
    protected static Logger logger = LogManager.getLogger();
    Person person_class = new Person(10073823, "Stiven", "Suarez", LocalDate.of(2000, 7, 23), "Cll 40#23AA-42", 500000);

    void run() {
        logger.info("The application is running!");
        logger.info(person_class.getPersonId());

        person_class.printPerson();
    }

}
