package test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1_googlesearch_TestNG_demo2 {

	WebDriver driver = null;
	
	@BeforeTest
	public void setuptest() {
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googlesearch2() {
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@Test
	public void googlesearch3() {
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	

	
	@AfterTest
	public void teatdowntest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed");
	}
}	
