package seleniumjavaframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredcapabilitiesdemo {
	
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/iedriver/IEDriverServer.exe";
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", driverpath);
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		driver.findElement(By.name("btnG")).sendKeys(Keys.RETURN);
		
	}
	

}
