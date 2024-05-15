package Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class baseclass {

	public String fileName;
	static WebDriver driver;

	@Parameters({ "url" })
	@BeforeSuite(groups = "sanity")
	public void LaunchApp(String url) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

//	@AfterSuite
//	public void logout() 
//	{
//		WebElement logoutpage= driver.findElement(By.xpath("//a[href=contains(text(),'opentaps')]/img[@alt='opentaps CRM']"));
//		logoutpage.click();
//		WebElement logout= driver.findElement(By.xpath("//input[@value='Logout']"));
//		logout.click();
//		System.out.println("Logged out sucessfully....");
//	}

}
