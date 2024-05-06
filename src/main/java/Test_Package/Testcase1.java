package Test_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Testcase1 {

	 WebDriver driver;

	@Test
	public void login() {
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
		WebElement Login= driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		Username.sendKeys("Demosalesmanager");
		Password.sendKeys("crmsfa");
		Login.click();
		
		WebElement crm = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crm.click();
	}	
	
	@Test
	public void createLead()
	{
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
	}
	
	
	@BeforeSuite
	public void LaunchApp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
	}

	@AfterClass
	public void logout() 
	{
		WebElement logoutpage= driver.findElement(By.xpath("//a[href=contains(text(),'opentaps')]/img[@alt='opentaps CRM']"));
		logoutpage.click();
		WebElement logout= driver.findElement(By.xpath("//input[@value='Logout']"));
		logout.click();
		System.out.println("Logged out sucessfully....");
	}

}
