package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/alerts");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	@Test(priority = 1)
	public void simpleAlertTestCase() {
		driver.findElement(By.id("simple")).click();
		Reporter.log("Simple Alert opened |");
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Reporter.log("Alert text is: " + alertText);
		Assert.assertEquals("You've just triggered a simple alert!", alertText);
		alert.accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
	}

	@Test(priority = 2)
	public void confirmAlertTestCase() {
		driver.findElement(By.id("confirmation")).click();
		Reporter.log("Confirmation Alert opened |");
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Reporter.log("Alert text is: " + alertText);
		Assert.assertEquals("You've just triggered a confirmation alert!", alertText);
		alert.accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
	}

	@Test(priority = 3)
	public void promptAlertTestCase() {
		driver.findElement(By.id("prompt")).click();
		Reporter.log("Prompt Alert opened |");
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Reporter.log("Alert text is: " + alertText);
		Assert.assertEquals("I'm a Prompt! Type something into me!", alertText);
		alert.sendKeys("Prompt message");
		alert.accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
