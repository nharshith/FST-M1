import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		System.out.println("Title of the web page: " +driver.getTitle());
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		aboutUs.click();
		//Thread.sleep(1000);
		
		System.out.println("Title of the second web page: " +driver.getTitle());
	}
}
