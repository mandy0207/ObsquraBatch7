package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1=driver.findElement(By.xpath("(//*[@id='checkboxes']/input)[1]"));
		
		//checks whether element is checked or not
		boolean checked=checkbox1.isSelected();
		System.out.println(checked);
		checkbox1.click();
		
		System.out.println(checkbox1.isSelected());
		
		//verifies element is displayed or not
		System.out.println("Is displayed : "+checkbox1.isDisplayed());
		
		//verifies element is clickable
		System.out.println("Is enabled : "+ checkbox1.isEnabled());
	

	}

}
