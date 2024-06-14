package learnAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnHardAssert {

	
	@Test
	public void hardAssert() {
		
		String actualName = "Amrith";
		
		String expectedName= "Amrith";
		/**
		 * In hard assertion
		 * if any assertion fails at a point, program will fail there or not go ahead
		 */
	   //compare two values equal or not
		Assert.assertEquals(actualName, expectedName);
		
		System.out.println("I am here");
	
		//compare condition is true or not
		Assert.assertTrue(true, "i am failing intentionally");
		
		System.out.println("I am there");
		
		Assert.assertFalse(false);
		
		
	}
}
