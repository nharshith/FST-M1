package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@DataProvider(name = "Authentication")
	public Object[][] credentials() {
		return new Object[][] { { "admin", "password" }, { "username", "password" } };
	}

	@Test(dataProvider = "Authentication")
	public void testActivity7(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
