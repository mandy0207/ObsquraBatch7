package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	
		/**
		 * Syntaxes for Xpath
		 * 1. //tagname[@attribute='value'] or //*[@attribute='value']
		 * 2. //parent/child  -> single slash let you grab immediate child
		 * 3. //parent//child -> concatenating two Xpath
		 * 4. //parent[index]/child or //parent[index]/child[index]
		 * 5. //*[contains(text(),'Substring')]   --> using text here 
		 * 6. //*[contains(@attribute,'substring value')]
		 */
		WebElement loginBtn=driver.findElement(By.xpath("//a[@class='ico-login']"));
		loginBtn.click();
		driver.findElement(By.xpath("//*[@class='email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//div[@class='buttons']//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Blue Jeans')]")).click();
		
		WebElement qtyBox = driver.findElement(By.xpath("//*[contains(@id,'_EnteredQuantity')]"));
		qtyBox.clear();
	    qtyBox.sendKeys("25");
	    
	    driver.quit();
		

		
	}
}
