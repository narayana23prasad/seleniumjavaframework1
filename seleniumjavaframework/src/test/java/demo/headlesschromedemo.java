package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesschromedemo {
	
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		
//		ChromeOptions ChromeOptions = new ChromeOptions();
//		ChromeOptions.addArguments("--headless");
//		
//		//ChromeOptions.addArguments("--window-size=1920x1080");
		ChromeOptions options = new ChromeOptions();
		
//		options.addArguments("--disable-gpu");
//		options.addArguments("--disable-extensions");
//		options.setExperimentalOption("useAutomationExtension", false);
//		options.addArguments("--proxy-server='direct://'");
//		options.addArguments("--proxy-bypass-list=*");
//		options.addArguments("--start-maximized");
		options.addArguments("headless");
		options.addArguments("--window-size=1920,1080");
		
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://google.com");	
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		System.out.println("completed");
	}
	
}
