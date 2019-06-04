package basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testing_logs {
	private static final Logger logger = LoggerFactory
			.getLogger(testing_logs.class);

	public static void main(String[] args) {
		logger.info("Testing 123");
		logger.info("Welcome to this  World!");
		logger.error("Error scheduling job  " + "job129" );
	}
}

/*

1. The Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction
for various logging frameworks, such as java.util.logging, logback and log4j.

2. SLF4J allows the end-user to plug in the desired logging framework at deployment time.

*/