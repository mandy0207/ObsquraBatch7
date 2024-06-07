package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");

		Actions act = new Actions(driver);

		WebElement others = driver.findElement(By.cssSelector("#others"));

		// hover over an element
		act.moveToElement(others).perform();

		WebElement textBox = driver.findElement(By.cssSelector("#single-input-field"));

		act.moveToElement(textBox).click().sendKeys("mandy").perform();

		textBox.clear();
		

		// pressing shift key while entering data in textbox
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("mandy").perform();
		//act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("m").keyUp(Keys.SHIFT).sendKeys("andy").perform();

		WebElement btn = driver.findElement(By.cssSelector("#button-one"));

		// double click
		act.moveToElement(btn).doubleClick().perform();

		// Right Click
		act.moveToElement(btn).contextClick().perform();

		//driver.quit();

	}
	


}
