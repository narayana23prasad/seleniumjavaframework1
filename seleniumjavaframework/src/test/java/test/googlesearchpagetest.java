package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googlesearchpageobjects;

public class googlesearchpagetest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googlesearchtest();
	}
	
	public static void googlesearchtest() {
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		
		googlesearchpageobjects searchpageobj = new googlesearchpageobjects(driver);
		
		driver.get("https://google.co.in/");
		searchpageobj.settextinsearchbox("abcd");
		searchpageobj.clicksearch();
		driver.close();
		
	}
	
}
