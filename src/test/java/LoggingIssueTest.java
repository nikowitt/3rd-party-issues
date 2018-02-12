

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingIssueTest {

	private static Logger LOGGER = LoggerFactory.getLogger(LoggingIssueTest.class);

	@Test
	public void testLogger() {

		LOGGER.error("This is my test!");
	}
}
