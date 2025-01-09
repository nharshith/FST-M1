import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement confirmAlertButton = driver.findElement(By.id("confirmation"));
		confirmAlertButton.click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Text from confirm alert: " +confirmAlert.getText());
		
		confirmAlert.accept();
		String result = driver.findElement(By.id("result")).getText();
		System.out.println("Result: " +result);
		
		confirmAlertButton.click();
		confirmAlert.dismiss();
		result = driver.findElement(By.id("result")).getText();
		System.out.println("Result: " +result);
		
		driver.quit();
	}
}
