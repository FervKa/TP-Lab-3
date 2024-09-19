package org.tp24;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ApplicationRunner {
    protected static Logger logger = LogManager.getLogger();
    Person person_class = new Person(10073823);

    void run() {
        logger.info("The application is running!");
        logger.info(person_class.getPersonId());
    }




}
