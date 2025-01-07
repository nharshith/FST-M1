import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement checkboxElement = driver.findElement(By.id("checkbox"));
		
		if(checkboxElement.isDisplayed()) {
			System.out.println("Checkbox is visible before clicking toggle button as expected");
		}
		else {
			System.out.println("Checkbox is not visible before clicking toggle button");
		}
		
		driver.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();
		
		if(checkboxElement.isDisplayed()) {
			System.out.println("Checkbox is visible after clicking toggle button");
		}
		else {
			System.out.println("Checkbox is not visible after clicking toggle button as expected");
		}
		
		driver.quit();
	}
}
