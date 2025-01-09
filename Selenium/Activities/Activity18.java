import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Title of the page: " +driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Text from Simple alert: " +simpleAlert.getText());
		
		simpleAlert.accept();
		
		String result = driver.findElement(By.id("result")).getText();
		
		System.out.println("Result: " +result);
		
		driver.quit();
	}
}
