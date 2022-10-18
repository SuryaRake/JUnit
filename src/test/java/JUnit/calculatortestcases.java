package JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatortestcases {
	
	@Test
	public void Test1(){
		assertEquals(11,Calculator.sum(5,6));
		
	}
	
	@Test
	public void Test2(){
		assertEquals(0,Calculator.diff(6,6));
		
	}

}
