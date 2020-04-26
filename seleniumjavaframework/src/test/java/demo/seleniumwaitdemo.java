package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumwaitdemo {
	
	public static void main(String[] args) {
		seleniumwaits();
	}
	
	public static void seleniumwaits() {
		
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//default is 250 milli second
		driver.get("https://google.com");	
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//explicit wait
		WebDriverWait wait = new  WebDriverWait(driver,20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcde")));
		
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
	}
	
}
