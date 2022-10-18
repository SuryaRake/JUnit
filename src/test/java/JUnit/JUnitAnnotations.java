package JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitAnnotations {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforeJUnit() {
		System.out.println("Before Each");
	}
	
	
	@Test
	public void Test1(){
		assertEquals(11,Calculator.sum(5,6));
		
	}
	
	@AfterEach
	public void afterJUnit() {
		System.out.println("After Each");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}

}
