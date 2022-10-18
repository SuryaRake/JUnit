package PkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import JUnit.StringFunctions;

public class PkgBTest {
	
	@Tag("Sanity")
	@DisplayName("PackageB Test")
	@Test
	public void Test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
