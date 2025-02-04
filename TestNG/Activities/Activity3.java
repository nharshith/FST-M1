package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/login-form/");
	}

	@Test
	public void testActivity() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Welcome Back, Admin!");
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
