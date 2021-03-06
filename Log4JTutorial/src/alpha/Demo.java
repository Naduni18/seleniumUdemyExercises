package alpha;

import org.apache.logging.log4j.*;

/**
 * @author Naduni
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		log.debug("I am a debug");
		log.error("I am an error");
		log.info("I am an info");
		log.fatal("I am a fatal");
		log.trace("I am a trace");
		log.warn("I am a warn");

	}

}
