import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("Title of the page: " +driver.getTitle());
		
		System.out.println("Current window: " +driver.getWindowHandle());
		driver.findElement(By.xpath("//button[text() = 'Open A New Tab']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Windows opened: " +windowHandles);
		
		for (String window : windowHandles) {
			driver.switchTo().window(window);
		}
		
		System.out.println("Title of new page: " +driver.getTitle());
		
		driver.findElement(By.xpath("//button[text() = 'Open Another One']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		windowHandles = driver.getWindowHandles();
		System.out.println("Window handles: " +windowHandles);
		
		for (String window : windowHandles) {
			driver.switchTo().window(window);
		}
		System.out.println("Title of new page: " +driver.getTitle());
		
		driver.quit();
	}
}
