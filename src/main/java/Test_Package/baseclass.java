package Test_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass {

	public String fileName;
	static WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeTest(groups = "sanity")
	public void LaunchApp(String browser, String url) throws InterruptedException {

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			Threadfactory.setDriver(driver);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			Threadfactory.setDriver(driver);
		}
//		Threadfactory.setDriver(driver);
		/*
		 * switch (browser) { case "Chrome": driver = new ChromeDriver(); break; case
		 * "Firefox": driver = new FirefoxDriver(); break; default:
		 * System.out.println("Browser not found."); break; }
		 */
		Threadfactory.getDriver().get(url);
		Threadfactory.getDriver().manage().window().maximize();
		Threadfactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterTest
	public void logout() {
		WebElement logoutpage = Threadfactory.getDriver()
				.findElement(By.xpath("//a[href=contains(text(),'opentaps')]/img[@alt='opentaps CRM']"));
		logoutpage.click();
		WebElement logout = Threadfactory.getDriver().findElement(By.xpath("//input[@value='Logout']"));
		logout.click();
		System.out.println("Logged out sucessfully....");
		Threadfactory.getDriver().quit();
		Threadfactory.unload();
	}

}
