

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IDEA_186376_LoggingIssueTest {

	private static Logger LOGGER = LoggerFactory.getLogger(IDEA_186376_LoggingIssueTest.class);

	@Test
	public void testLogger() {

		LOGGER.error("This is my test. Class is not highlighted unless you add a '.' to the conversion pattern in log4j.xml");
	}
}
