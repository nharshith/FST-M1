package activities;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity6 {

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
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();

		// Server URL
		URL serverUrl = new URI("http://localhost:4723").toURL();

		// Initialize the driver
		driver = new AndroidDriver(serverUrl, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://training-support.net/webelements/sliders");
	}

	// Test function
	@Test(priority = 1)
	public void volume75Test() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar")));
		// Get the size of the screen
		Dimension dims = driver.manage().window().getSize();
		// Set the start and end points
		Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .72));
		Point end = new Point((int) (dims.getWidth() * .67), (int) (dims.getHeight() * .72));

		// Perform swipe
		ActionsBase.doSwipe(driver, start, end, 200);

		// Get the volume level
		String volumeText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text, '%')]"))
				.getText();

		// Assertions
		assertTrue(volumeText.contains("75%"));
	}

	// Test function
	@Test(priority = 2)
	public void volume25Test() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar")));
		// Get the size of the screen
		Dimension dims = driver.manage().window().getSize();
		// Set the start and end points
		Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .72));
		Point end = new Point((int) (dims.getWidth() * .34), (int) (dims.getHeight() * .72));

		// Perform swipe
		ActionsBase.doSwipe(driver, start, end, 200);

		// Get the volume level
		String volumeText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text, '%')]"))
				.getText();

		// Assertions
		assertTrue(volumeText.contains("25%"));
	}

	// Tear down function
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
