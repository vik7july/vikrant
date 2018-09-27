package listener_Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

@Test
public class ListenerTest implements ITestListener {
	// When TestCase Fails this method called
	public void onTestFailure(ITestResult Result) {
		System.out.println("The Name of Test case failed: " + Result.getName());
	}

	public void onTestStart(ITestResult Result) {
		System.out.println("Test Case Started:" + Result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success:" + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of Test Case Skipped" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("The name of Test case Started:" + context.getName());

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("The name of test case finished" + context.getName());

	}

}
