package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class testNGlisteners implements ITestListener,ISuiteListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("********* Test Started *********" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("********* Test is successful *********" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("********* Test failed *********" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("********* Test skipped *********" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("********* Tests Completed *********" + context.getName());
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onStart(suite);
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onFinish(suite);
	}

}
