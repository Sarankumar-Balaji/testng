package Test_Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch_App {

	static WebDriver driver;
	
	@BeforeTest
	public void driver()
	{
		driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@class='navbar_Loginbutton__O9-64' and contains(@id,'loginB')]")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bsarankumarbalaji@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shopperstack@12");
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv' and @id='addToWishlist'])[7]")).click();
		
		driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")).click();
	
		driver.findElement(By.xpath("//li[text()='Wish List']")).click(); 
		driver.findElement(By.xpath("//button[contains(text(),'Cart')]")).click();
		driver.findElement(By.xpath("//*[@id='cart']")).click();

	}
	
	
	
	
}
