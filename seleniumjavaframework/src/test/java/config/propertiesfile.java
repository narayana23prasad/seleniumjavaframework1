package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.test1_googlesearch_TestNG_demo;

public class propertiesfile {
	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getproperties();
		setproperties();
		getproperties();		
	}

	public static void getproperties() {
		try {


			InputStream input = new FileInputStream(projectpath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			test1_googlesearch_TestNG_demo.browsername = browser;
		} 

		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	}	
	public static void setproperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/test/java/config/config.properties");
			prop.setProperty("Result", "pass");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

}
