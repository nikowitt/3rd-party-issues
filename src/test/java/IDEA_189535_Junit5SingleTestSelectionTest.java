import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.junit5.SimpleScenarioTest;

public class IDEA_189535_Junit5SingleTestSelectionTest extends SimpleScenarioTest<IDEA_189535_Junit5SingleTestSelectionTest.MyStage> {

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
	public void test(String arg) throws Exception {
		given().$("a test: "+ arg, MyStage::doNothing);
	}
	
	static class MyStage extends Stage<MyStage> {

		public MyStage doNothing() {
			return self();
		}
	}
}
