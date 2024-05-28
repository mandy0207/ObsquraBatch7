package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		
		// ctrl+shift+o
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//will open a URL
		driver.get("https://www.flipkart.com/");
		
		
		
		
		
		
		
		
	}
}
