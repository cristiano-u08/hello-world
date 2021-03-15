package logic;

import java.util.logging.Logger;

public class HelloWorld {

	private static final Logger LOGGER = Logger.getLogger("Hello World!");
	
	public static void main(String[] args) {
		
		LOGGER.info(LOGGER.getName());
	}

}
