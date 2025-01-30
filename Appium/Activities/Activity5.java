package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity5 {

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
		options.setAppPackage("com.google.android.apps.messaging");
		options.setAppActivity(".ui.ConversationListActivity");
		options.noReset();

		// Server URL
		URL serverUrl = new URI("http://localhost:4723").toURL();

		// Initialize the driver
		driver = new AndroidDriver(serverUrl, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	// Test function
	@Test
	public void sendMessageTest() {
		driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='ContactSearchField']"))));
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='ContactSearchField']"))
				.sendKeys("7892954743");
		driver.findElement(
				AppiumBy.xpath("//android.view.View[@resource-id='ContactSuggestionList']/android.view.View[2]"))
				.click();
		driver.findElement(AppiumBy.id("compose_message_text")).sendKeys("Hello from Appium");
		driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.className("android.widget.TextView"))));
		String message = driver.findElement(AppiumBy.className("android.widget.TextView")).getText();
		Assert.assertEquals(message, "Hello from Appium");
	}

	// Tear down function
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
