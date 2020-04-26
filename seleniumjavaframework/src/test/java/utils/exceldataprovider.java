package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldataprovider {
	
	WebDriver driver;
	
	@BeforeTest
	public void setuptest() {
		String projectpath = System.getProperty("user.dir");
		String driverpath = projectpath + "/drivers/chromedriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		
		
	}
	
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password) throws InterruptedException {
		System.out.println(username + " | " +password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	}

//	public static void main(String[] args) {
// 		String projectpath = System.getProperty("user.dir");
//		String excelpath = projectpath + "\\excel\\data.xlsx";
//		Strin	g sheetname = "Sheet1";
//		
//		testdata(excelpath,sheetname);
//	}
	
	@DataProvider(name = "test1data")
	public static Object[][] getdata() {
		String projectpath = System.getProperty("user.dir");
		String excelpath = projectpath + "\\excel\\data.xlsx";
		String sheetname = "Sheet1";
		Object data[][] = testdata(excelpath, sheetname);
		return data;
	}
	
	public static Object[][] testdata(String excelpath, String sheetname) {
		excelutils excel = new excelutils(excelpath,sheetname);
		int rowcount = excel.getrowcount();
		int colcount = excel.getcolcount();
		
		Object data[][] = new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++){
				String celldata = excel.getcelldatastring(i, j);
				//System.out.print(celldata+" | ");
				data[i-1][j] = celldata;
			}
				System.out.println();
		}
		return data;
	}


}
