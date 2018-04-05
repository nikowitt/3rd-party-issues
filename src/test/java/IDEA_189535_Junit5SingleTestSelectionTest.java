import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IDEA_189535_Junit5SingleTestSelectionTest {

	private static Logger LOGGER = LoggerFactory.getLogger(IDEA_189535_Junit5SingleTestSelectionTest.class);

	public static Stream<Arguments> test() {
		return Stream.of(
				of("a","b"),
				of("b","c"),
				of("c","d")
		);
	}

	@ParameterizedTest
	@MethodSource
	public void test(String arg, String arg1) throws Exception {
		LOGGER.error("Single test selection breaks when the test signature changes without wiping all existing test configurations.");
	}
	
}
