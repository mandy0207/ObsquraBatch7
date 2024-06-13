package learnTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTesting {
	
	/*
	 * 1. Anything annotated with @Test would be considered as a test case.
	 * 2. Order of execution of test cases would depend upon alphabetical order of test case.
	 * 3. Order of execution can be prioritized using priority. Lower priority means would be executed first . {0,1,2}
	 * 4. If any test case has same priority or no priority , alphabetical order will take precedence.
	 * 5. BeforeTest will execute once before all test cases present inside class
	 * 6. AfterTest will execute once after all test cases present inside class.
	 * 7. BeforeMethod will execute before every test case present inside class
	 * 8. After test case will execute after every test case present inside class.
	 * 9. Before Class will execute before all test cases at a class level
	 * 10. After, Before suite - 
	 * 
	 *
	 */
	

	@Test(groups="Smoke")
	@Parameters({"UserName","Password"})
	public void firstWebTest( @Optional String userName, @Optional String password) {
		System.out.println("I am inside first web test case");
		System.out.println(userName +  " : "+ password);
	} 
	
	
	
	@Test(priority=1, groups="Regression")
	public void secondWebTest() {
		System.out.println("I am inside second web test case");
	} 
	

	@BeforeTest
	public void beforeWebTest() {
		System.out.println("I am in before web test");
	}
	
	
	@AfterTest
	public void afterWebTest() {
		System.out.println("I am in after web test");
	}
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("I am in before method");
//	}
//	
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("I am in after method");
//	}
	
	
	
	

	
	
	
	
	
	
}
