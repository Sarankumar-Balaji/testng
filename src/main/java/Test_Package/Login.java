package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends baseclass{
	@Parameters({"username","password"})
	@Test(groups="sanity")
	public void login(String user_name,String pwd) {
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
		WebElement Login= driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		Username.sendKeys(user_name);
		Password.sendKeys(pwd);
		Login.click();
		
		WebElement crm = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crm.click();
	}	
}
