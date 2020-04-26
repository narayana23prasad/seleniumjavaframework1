package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreportsbasicdemo {		

	static private WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test1, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google search test1 one", "Sample description");
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting test1 case");
		driver.get("https://google.co.in/");
		test1.pass("Navigated google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation");
		test1.pass("Entered text in search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		driver.close();
		test1.pass("Closed the browser");
		driver.quit();
		test1.info("test1 completed");
		
		// creates a toggle for the given test2, adds all log events under it    
		ExtentTest test2 = extent.createTest("Google search test2 one", "Sample description");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting test2 case");
		driver.get("https://google.co.in/");
		test2.pass("Navigated google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("automation");
		test2.fail("Entered text in search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.pass("Pressed keyboard enter key");
		driver.close();
		test2.pass("Closed the browser");
		driver.quit();
		test2.info("test2 completed");
		
		extent.flush();
	}

}
