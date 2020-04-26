package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGparametersdemo {
	
	@Test
	@Parameters({"myname"})
	public void test(@Optional("default value") String name) {
		System.out.println("name is: "+name);
	}
	
	
}
