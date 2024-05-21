package Test_Package;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends baseclass
{
	@Test
	public static void asserttion()
	{
		String Expected_Status="Assigned";
		WebElement status= driver.findElement(By.xpath("//span[text()='Status']/following::td/span"));
		String actual_status = status.getText();
		assertEquals(actual_status, Expected_Status);
		// assertNotEquals(actual_status, Expected_Status);
		WebElement assignedperson = driver.findElement(By.xpath("//span[text()='Demo Sales Manager']"));
		String actual_assignPerson = assignedperson.getText();
		String Expected_assignPerson = "Demo Manager";
		assertNotEquals(actual_assignPerson, Expected_assignPerson);
		System.out.println("Assigned Person:" + actual_assignPerson);
		WebElement reassign = driver
				.findElement(By.xpath("//span[text()='Reassign To']/following::input[@value='Reassign']"));
		assertTrue(reassign.isEnabled());
		System.out.println("Hard assert executed.");
		// assertFalse(reassign.isDisplayed());
		SoftAssert as = new SoftAssert();
		// as.assertFalse(reassign.isDisplayed());

		System.out.println("Soft assert executed.");


		as.assertAll();
	}
}
