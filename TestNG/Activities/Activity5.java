package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
	public WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testCase1() {
		String title = driver.getTitle();
		System.out.println("Title of the page: " +title);
		Assert.assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test(groups = { "HeaderTests" })
	public void testCase2() {
		String headerText = driver.findElement(By.xpath("//h3[contains(@class,'orange')]")).getText();
		Assert.assertEquals(headerText, "Heading #3");
	}
	
	@Test(groups = { "HeaderTests" })
	public void testCase3() {
		Color headerColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(@class,'purple')]")).getCssValue("color"));
		Assert.assertEquals(headerColor.asHex(), "#9333ea");
	}
	
	@Test(groups = { "ButtonTests" })
	public void testCase4() {
		String emeraldButton = driver.findElement(By.xpath("//button[contains(@class,'emerald')]")).getText();
		Assert.assertEquals(emeraldButton, "Emerald");
	}
	
	@Test(groups = { "ButtonTests" })
	public void testCase5() {
		Color buttonColor = Color.fromString(driver.findElement(By.xpath("//button[contains(text(),'Purple')]")).getCssValue("color"));
		Assert.assertEquals(buttonColor.asHex(), "#581c87");
	}
	
	
	@AfterClass(alwaysRun = true)
	public void teardown() {
		driver.close();
	}

}
