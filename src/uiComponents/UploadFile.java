package uiComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.cssSelector("#pickfiles")).click();
		
		String fileToUpload= System.getProperty("user.dir")+"\\fileName.pdf";
		uploadFile(fileToUpload);
		
	
		driver.quit();
	}
	
	
	
	public static void uploadFile(String fileToUpload) throws AWTException, InterruptedException {
		StringSelection ss = new StringSelection(fileToUpload);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    Thread.sleep(1000);
	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
