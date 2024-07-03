package uiComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {

	@Test
	public void handleJSAlert() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    //click on ok button
	    alert.accept();
	    
	    driver.findElement(By.cssSelector(".btn-warning")).click();
	    //click on cancel button
	    Thread.sleep(2000);
	    alert.dismiss();

	    driver.findElement(By.cssSelector(".btn-danger")).click();
	    alert.sendKeys("hi how are you !");
	    Thread.sleep(2000);
	    alert.accept();
	    
	    driver.quit();
	    
	  
		
	}
}
