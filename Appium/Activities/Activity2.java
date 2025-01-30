package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
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
	}

	// Test function
	@Test
	public void test() throws InterruptedException {
		driver.get("https://training-support.net");
		String heading = driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']")).getText();
		System.out.println("Heading: " + heading);
		driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		String aboutUsHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).getText();
		System.out.println("Heading: " + aboutUsHeading);
	}

	// Tear down function
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
