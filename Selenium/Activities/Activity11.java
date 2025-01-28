import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/dynamic-controls");
		driver.manage().window().maximize();
		System.out.println("Title of the page: " +driver.getTitle());
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		WebElement toggleCheckbox = driver.findElement(By.xpath("//div[@id='checkboxDiv']//following-sibling::button"));

		toggleCheckbox.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
		toggleCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox")));
		checkbox.click();

		driver.close();
	}

}
