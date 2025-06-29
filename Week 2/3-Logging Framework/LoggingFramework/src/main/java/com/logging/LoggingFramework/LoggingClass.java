package com.logging.LoggingFramework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggingClass {
	private static final Logger logger = LoggerFactory.getLogger(LoggingClass.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
