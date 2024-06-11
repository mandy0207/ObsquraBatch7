package uiComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWaits {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		/**
		 * 
		 * Implicit wait
		 * 1. Global wait- applied to each element
		 * 2. wait until defined time limit
		 * 3. if element displayed before time limit it will not wait unlike Thread.sleep()
		 */
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.findElement(By.cssSelector("#save")).click();
	
		String name=driver.findElement(By.cssSelector(".card-title")).getText();
		System.out.println(name);
		

		
		
		driver.quit();
		

	}

}
