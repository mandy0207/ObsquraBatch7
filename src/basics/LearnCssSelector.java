package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/**
		 * Css Syntax
		 * 1. if you have a classname => .className
		 * 2. if you have an id => #id
		 * 3. tagname[attribute='value'] or [attribute='value']
		 * 4. in case of multiple classes use dot instead of space
		 * 5. .classname child:nth-child(index)  (for travelling to next child use space)
		 * 6. [attribute*='substring value'] 
		 * 
		 */
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.cssSelector(".list li:nth-child(4) a")).click();
		
		//use this [id*='_EnteredQuantity']
		driver.quit();
		
		
		
		
		
		
		
	}

}
