package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoitdemo {
	
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test() throws Exception {
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("uploaded_file")).click();
		//driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		//driver.findElement(By.className("pole_plik")).click();
		Runtime.getRuntime().exec("D:\\Prasad\\fileuploadscript.exe");
		Thread.sleep(3000);
		//driver.close();
		
	}
	
	
}
