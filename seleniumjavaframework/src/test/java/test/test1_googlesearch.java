package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_googlesearch {
	public static void main(String[] args) {
		googlesearch();
	}
	
	public static void googlesearch() {
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

}
