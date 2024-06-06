package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//scrollByValue(300);
		WebElement desiredElement = driver.findElement(By.cssSelector("[class='totalAmount']"));
		scrollToElement(desiredElement);
		scrollToBottomofPage() ;
		
		driver.quit();

	}

	
	public static void scrollToElement(WebElement desiredElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
	}

	public static void scrollByValue(int value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll up to some y cordinate
		js.executeScript("window.scrollBy(0,300);");
	}
	
	public static void scrollToBottomofPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	}

}
