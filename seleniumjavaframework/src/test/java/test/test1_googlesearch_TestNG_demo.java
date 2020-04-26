package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.propertiesfile;

public class test1_googlesearch_TestNG_demo {

	WebDriver driver = null;
	public static String browsername = null;
	
	@BeforeTest
	public void setuptest() {
		String projectpath = System.getProperty("user.dir");
		propertiesfile.getproperties();
		
		if(browsername.equalsIgnoreCase("chrome")) {
			String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			String driverpath = projectpath + "/drivers/geckodriver/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverpath);
			driver = new FirefoxDriver();
		}
		
		
	}
	
	@Test
	public void googlesearch() {
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void teardowntest() {
		driver.close();
		//driver.quit();
		System.out.println("Test completed");
		propertiesfile.setproperties();
	}
}	
