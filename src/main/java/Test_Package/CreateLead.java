package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLead extends baseclass {

	@Test(dataProvider = "dynamicfetchData", dataProviderClass = ReadExcel.class /*
																					 * invocationCount = 2 retryAnalyze
																					 * * = RetryFailedTc .class
																					 */)
	public void createLead(String cname, String fname, String lname) throws InterruptedException {

		// WebDriverWait waits=new WebDriverWait(driver, Duration.ofMinutes(3));


		WebElement leads = Threadfactory.getDriver().findElement(By.xpath("//a[text()='Leads']"));
		// waits.until(ExpectedConditions.elementToBeClickable(leads));
		leads.click();

		WebElement createlead = Threadfactory.getDriver().findElement(By.xpath("//a[text()='Create Lead']"));
		createlead.click();

		WebElement companyname = Threadfactory.getDriver().findElement(
				By.xpath("//span[text()='Company Name']/following::input[@id='createLeadForm_companyName']"));
		// waits.until(ExpectedConditions.elementToBeClickable(companyname));

		WebElement firstname = Threadfactory.getDriver()
				.findElement(By.xpath("//span[text()='First name']/following::input[@id='createLeadForm_firstName']"));
		WebElement lastname = Threadfactory.getDriver()
				.findElement(By.xpath("//span[text()='Last name']/following::input[@id='createLeadForm_lastName']"));
		companyname.sendKeys(cname);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		WebElement submit = Threadfactory.getDriver().findElement(By.xpath("//input[@class='smallSubmit']"));
		submit.click();
	}

	/*
	 * @DataProvider(name="staticfetchData") public String [][] staticData() throws
	 * IOException { String data[][] = new String[2] [3]; data[0][0]="Wps3";
	 * data[0][1]="Doc3"; data[0][2]="Test3";
	 * 
	 * data[1][0]="Wps4"; data[1][1]="Doc4"; data[1][2]="Test4"; return data; }
	 */

}
