package Reporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnReports {
	ExtentReports extent;
	@BeforeTest
	public void generateReport() {
		String reportPath = System.getProperty("user.dir")+"/Reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Demo WebShop");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name", "Anjali");
		extent.setSystemInfo("Brand", "Demo WebShop");
	}
	
	@Test
	public void mytest1() {
		ExtentTest test = extent.createTest("mytest1");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		test.log(Status.PASS, "I am passing");
		driver.quit();
		extent.flush();
		
	}
	
	@Test
	public void mytest2() {
		ExtentTest test = extent.createTest("mytest2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		test.log(Status.PASS, "Passed");
		driver.quit();
		extent.flush();
		
	}

	@Test
	public void mytest3() {
		ExtentTest test = extent.createTest("mytest2");
		test.log(Status.FAIL, "Failing deliberately");
		extent.flush();
	}
}
