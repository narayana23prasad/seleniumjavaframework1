package demo;

import org.testng.annotations.Test;

public class testNGdpependencydemo {
	
	//@Test(dependsOnMethods={"test2","test3"},priority=1)
	//@Test(dependsOnGroups={"sanity1"})
	@Test(dependsOnGroups={"sanity.*"})
	public void test1() {
		System.out.println("i am inside test1");
	}

	@Test(groups={"sanity1"})
	public void test2() {
		System.out.println("i am inside test2");
	}
	
	@Test(groups={"sanity2"})
	public void test3() {
		System.out.println("i am inside test3");
	}
	@Test(priority=2)
	public void test4() {
		System.out.println("i am inside test4");
	}
	
	
}
