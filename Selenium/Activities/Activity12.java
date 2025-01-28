import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/dynamic-content");
		driver.manage().window().maximize();
		System.out.println("Title of the page: " +driver.getTitle());
		WebElement clickMeButton = driver.findElement(By.id("genButton"));
		WebElement word = driver.findElement(By.id("word"));

		clickMeButton.click();
		wait.until(ExpectedConditions.textToBePresentInElement(word, "release"));

		System.out.println("Text displayed: " + word.getText());
		driver.close();
	}
}