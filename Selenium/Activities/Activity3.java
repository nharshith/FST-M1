import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		System.out.println("Title of the first web page: " +driver.getTitle());
		
		driver.findElement(By.xpath("//a[text() = 'About Us']")).click();
		System.out.println("Title of the second web page: " +driver.getTitle());
		
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Title of the third web page: " +driver.getTitle());
		
		WebElement userName = driver.findElement(By.xpath("//input[@id = 'username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Submit']"));
		
		userName.sendKeys("admin");
		password.sendKeys("password");
		loginButton.click();
		
		System.out.println("Title of the fourth web page: " +driver.getTitle());
		
		driver.quit();
		
	}

}
