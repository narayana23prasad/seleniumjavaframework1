package seleniumjavaframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browsertest {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		//String driverpath = projectpath + "/drivers/geckodriver/geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver", driverpath);
		
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		//String driverpath = projectpath + "/drivers/iedriver/IEDriverServer.exe";
		//System.setProperty("webdriver.ie.driver", driverpath);

		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello");
		List<WebElement> listofinputelements = driver.findElements(By.xpath("//input"));
		System.out.println(listofinputelements.size());
		
	}
	

}
