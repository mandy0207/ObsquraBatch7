package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test
	public void firstMobileTest() {
		System.out.println("I am in first Mobile Test");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside before class Mobile");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am inside after class Mobile ");
	}
	
	
	
	
	/**
	 * 
	 * SUITE
	 * TEST
	 * CLASS
	 * 
	 */
	
}

