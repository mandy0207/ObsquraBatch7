package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement desiredElement = driver.findElement(By.cssSelector(".totalAmount"));
		scrollToElement(desiredElement);
		/**
		 * switch top frame by following ways 1. By id or name 2. By index 3. By
		 * WebElement
		 * 
		 */

		// switching through id
		driver.switchTo().frame("iframe-name");
		/**
		 * switching through webelement WebElement frameWebElement =
		 * driver.findElement(By.xpath("//*[@id='courses-iframe']"));
		 * driver.switchTo().frame(frameWebElement);
		 */

		String emailId = driver.findElement(By.xpath("//*[@class='icon fa fa-envelope']/parent::*")).getText();
		System.out.println(emailId);
		
		//switch out of frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("mousehover")).click();
		
		

		driver.quit();

	}

	public static void scrollToElement(WebElement desiredElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
	}

}
