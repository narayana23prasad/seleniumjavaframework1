package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGretryfaileddemo {
	
	@Test
	public void test1() {
		System.out.println("i am inside test1");
	}

	@Test
	public void test2() {
		System.out.println("i am inside test3");
		//int i=1/0;
	}

	@Test(retryAnalyzer = listeners.testNGretryanalyser.class)
	public void test3() {
		System.out.println("i am inside test3");
		Assert.assertTrue(0>1);
	}

	
}
