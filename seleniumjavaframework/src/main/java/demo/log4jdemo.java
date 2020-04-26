package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	
	private static Logger logger = LogManager.getLogger(log4jdemo.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.trace("this is trace message");
		System.out.println("\n Hello world \n");
		logger.info("this is info");
		logger.error("this is error");
		logger.warn("this is a fatal message");
		System.out.println("completed");
	}

}
