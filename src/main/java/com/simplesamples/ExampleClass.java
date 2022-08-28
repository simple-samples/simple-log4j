package com.simplesamples;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleClass {
    Logger logger = LogManager.getRootLogger();

    public void logMessage(String str){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + str);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + str);
        }

        logger.warn("This is warn : " + str);
        logger.error("This is error : " + str);
        logger.fatal("This is fatal : " + str);

    }
}
