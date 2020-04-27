package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(listeners.testNGlisteners.class)
public class testNGlistnerdemo {
	
	@Test
	public void test1() {
		System.out.println("Inside test1");
	}
	@Test
	public void test2() {
		System.out.println("Inside test2");
		//Assert.assertTrue(false);
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("hello");
		driver.close();
		
		
	}
	@Test
	public void test3() {
		System.out.println("Inside test3");
		throw new SkipException("This test is skipped");
	}

}
