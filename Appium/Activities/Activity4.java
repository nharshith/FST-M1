package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {

	// Declare driver
	AppiumDriver driver;
	WebDriverWait wait;

	// Setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.contacts");
		options.setAppActivity(".activities.PeopleActivity");
		options.noReset();

		// Server URL
		URL serverUrl = new URI("http://localhost:4723").toURL();

		// Initialize the driver
		driver = new AndroidDriver(serverUrl, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	// Test function
	@Test
	public void addTest() {
		driver.findElement(AppiumBy.accessibilityId("Create new contact")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Appium");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("Test");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("1234567890");
		driver.findElement(AppiumBy.id("editor_menu_save_button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("large_title")));

		assertEquals(driver.findElement(AppiumBy.id("large_title")).getText(), "Appium Test");
	}

	// Tear down function
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}