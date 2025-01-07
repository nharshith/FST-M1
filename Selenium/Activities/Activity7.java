import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement textInput = driver.findElement(By.id("textInput"));
		
		if(textInput.isEnabled()) {
			System.out.println("Input field is enabled");
		}
		else {
			System.out.println("Input field is disabled as expected");
		}
		
		driver.findElement(By.id("textInputButton")).click();
		
		if(textInput.isEnabled()) {
			System.out.println("Input field is enabled as expected");
		}
		else {
			System.out.println("Input field is disabled");
		}
		
		driver.quit();
	}

}
