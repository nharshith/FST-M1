package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {

	// Declare driver
	AppiumDriver driver;

	// Setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.calculator2");
		options.setAppActivity(".Calculator");
		options.noReset();

		// Server URL
		URL serverUrl = new URI("http://localhost:4723").toURL();

		// Initialize the driver
		driver = new AndroidDriver(serverUrl, options);
	}

	// Test function
	@Test(priority = 1)
	public void addionTest() {
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.id("digit_7")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result = driver.findElement(By.id("result")).getText();
		assertEquals(result, "12");
	}

	@Test(priority = 2)
	public void substractionTest() {
		driver.findElement(AppiumBy.id("digit_8")).click();
		driver.findElement(AppiumBy.accessibilityId("minus")).click();
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result = driver.findElement(By.id("result")).getText();
		assertEquals(result, "3");
	}

	@Test(priority = 3)
	public void multiplicationTest() {
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("×")).click();
		driver.findElement(AppiumBy.id("digit_7")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result = driver.findElement(By.id("result")).getText();
		assertEquals(result, "35");
	}

	@Test(priority = 4)
	public void divisionTest() {
		driver.findElement(AppiumBy.id("digit_2")).click();
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("divide")).click();
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result = driver.findElement(By.id("result")).getText();
		assertEquals(result, "5");
	}

	// Tear down function
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
