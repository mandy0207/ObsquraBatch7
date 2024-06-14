package learnAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert {

	@Test
	public void learnsoftAssert() {
		
		SoftAssert softAssert = new SoftAssert();
		
	   String actualName = "Amrith";
		
		String expectedName= "amrith";
		/**
		 * In hard assertion
		 * if any assertion fails at a point, program will fail there or not go ahead
		 */
	   //compare two values equal or not
		softAssert.assertEquals(actualName, expectedName);
		
		System.out.println("I am here");
	
		//compare condition is true or not
		softAssert.assertTrue(false);
		
		System.out.println("I am there");
		
		softAssert.assertFalse(true);
		
		softAssert.assertAll();
	}
}
