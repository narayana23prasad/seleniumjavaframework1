package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testNGmultibrowserdemo {

	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");
	
	@Parameters("browsername")
	//String browsername = "chrome";
	@BeforeTest
	public void setup(String browsername){
		System.out.println("Browser name is: "+browsername);
		System.out.println("Thread id: "+Thread.currentThread().getId());
		if(browsername.equalsIgnoreCase("chrome")){
			String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			String driverpath = projectpath + "/drivers/geckodriver/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverpath);
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("ie")) {
			String driverpath = projectpath + "/drivers/iedriver/IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", driverpath);
			driver = new InternetExplorerDriver();
		}
		
	}

	@Test
	public void test1() throws InterruptedException{
		driver.get("https://google.com");
		Thread.sleep(5000);
	}

	@AfterTest
	public void teardown(){
		driver.close();
		//driver.quit();
	}


}
