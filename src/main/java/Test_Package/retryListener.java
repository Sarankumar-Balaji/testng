package Test_Package;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class retryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryFailedTc.class);
		/*
		 * System.out.println(testMethod.getName()); if
		 * (testClass.getName().equals("Login")) { annotation.setInvocationCount(2); }
		 */
	}
}
