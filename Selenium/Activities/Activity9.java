import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);

		driver.get("https://training-support.net/webelements/keyboard-events");
		driver.manage().window().maximize();
		System.out.println("Title of the page: " +driver.getTitle());
		WebElement textArea = driver.findElement(By.xpath("//h1[contains(@class, 'mt-3')]"));

		action.sendKeys(textArea, "Selenium Test").build().perform();

		String text = textArea.getText();

		System.out.println("Text displayed on the webpage: " +text);

		driver.close();
	}
}
