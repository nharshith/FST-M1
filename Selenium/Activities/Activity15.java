import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement fullName = driver.findElement(By.cssSelector("input[id^='full-name']"));
        WebElement email = driver.findElement(By.cssSelector("input[id$='-email']"));
        WebElement eventDate = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
        WebElement details = driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));
        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
        
        fullName.sendKeys("abc");
        email.sendKeys("abc@xyz.com");
        eventDate.sendKeys("2025-01-26");
        details.sendKeys("Details");
        submit.click();
        
        String result = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Result: " +result);
        
        driver.quit();        
	}

}
