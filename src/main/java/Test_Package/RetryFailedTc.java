package Test_Package;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTc implements IRetryAnalyzer {
	int count = 0;
	@Override
	public boolean retry(ITestResult result) {
		if (count < 1) {
			count++;
			System.out.println("count: " + count);
			return true;
		}
		return false;
	}
}
