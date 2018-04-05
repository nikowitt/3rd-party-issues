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
				of("a"),
				of("b"),
				of("c")
		);
	}

	@ParameterizedTest
	@MethodSource
	public void test(String arg, String arg1) throws Exception {
		LOGGER.error("See https://youtrack.jetbrains.com/issue/IDEA-189535#comment=27-2799619");
	}
	
}
