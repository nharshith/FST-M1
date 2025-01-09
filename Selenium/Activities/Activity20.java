import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement promptAlertButton = driver.findElement(By.id("prompt"));
		promptAlertButton.click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Text from prompt alert: " +promptAlert.getText());
		
		promptAlert.sendKeys("Awesome!");
		promptAlert.accept();
		String result = driver.findElement(By.id("result")).getText();
		System.out.println("Result: " +result);
		
		driver.quit();		
	}
}
