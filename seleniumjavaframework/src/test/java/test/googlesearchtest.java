package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.googlesearchpage;


public class googlesearchtest {
	
	private static WebDriver driver = null;	
	
	public static void main(String[] args) {
		
		googlesearch();
	}
	
	public static void googlesearch() {
		
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get("https://google.co.in/");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		googlesearchpage.textbox_search(driver).sendKeys("automation step by step");
		googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
	}

}
