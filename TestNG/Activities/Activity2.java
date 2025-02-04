package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice/");
	}

	@Test
	public void testCase1() {
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		Assert.assertEquals(title, "Selenium: Target Practice");
	}

	@Test
	public void testCase2() {
		WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
		Assert.assertTrue(blackButton.isDisplayed());
	}

	@Test(enabled = false)
	public void testCase3() {

	}

	@Test
	public void testCase4() {
		throw new SkipException("Skipping test case");
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
