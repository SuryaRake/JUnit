package JUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTestExample {

	@ValueSource(strings = { "radar", "dad", "amma" })
	@ParameterizedTest
	public void Test1(String arg1) {
		assertTrue(StringFunctions.isPalindrom(arg1));
	}
	
	
	@CsvSource(value = { "malayalam:malayalam:Comparison test"}, delimiter = ':')
	@DisplayName("Example of comparison btwn expected and actual value")
	@ParameterizedTest
	public void Test2(String arg1, String arg2, String argMessage) {
		assertEquals(arg1,arg2);
		System.out.println(argMessage);
	}

}
