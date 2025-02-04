package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

	public WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net");
	}
	
	@Test
	public void testActivity() {
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		Assert.assertEquals(title, "Training Support");
		
		driver.findElement(By.linkText("About Us")).click();
		title = driver.getTitle();
		System.out.println("Title of new page: " + title);
		
		Assert.assertEquals(title, "About Training Support");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
