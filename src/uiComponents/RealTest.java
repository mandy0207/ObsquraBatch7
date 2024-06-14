package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RealTest {

	@Test
	public void myrealTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");	
		
		boolean displayed=driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		Assert.assertTrue(displayed, "subscribe Button is not displayed");
		
		String actualHeading = driver.findElement(By.cssSelector("h2[class*='-content-header']")).getText();
		
		Assert.assertEquals(actualHeading , "Welcome to our store");
		driver.quit();
	}
}
