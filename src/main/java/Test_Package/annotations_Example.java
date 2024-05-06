package Test_Package;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations_Example 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void Launch()
	{
		System.out.println("Before class");	
	}
	
	@AfterClass
	public static void close()
	{
		System.out.println("After class");	
	}
	
	@BeforeSuite
	public static void suitemethod()
	{
		System.out.println("Before suite");	
	}

	@AfterSuite
	public static void aftersuitemethod()
	{
		System.out.println("After suite ");	
	}

	@BeforeTest
	public static void login()
	{
		System.out.println("Before test");	
	}
	@AfterTest
	public static void Logout()
	{
		System.out.println("After test");	
	}
	@BeforeMethod
	public static void connecttoDB()
	{
		System.out.println("before method");
		
	}
	@AfterMethod
	public static void disconnectfromDB()
	{
		System.out.println("After method");
	}
	
	
	@Test
	public void TC1()
	{	
		System.out.println("Testcase 1");
	}
	@Test (priority = -1)
	public void TC2()
	{
		System.out.println("Testcase 2");
		
	}
	
	
	
	
	
}
