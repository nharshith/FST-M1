import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
        
        action.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(1000).click(cargoToml).build().perform();
        
        String result = driver.findElement(By.id("result")).getText();
        System.out.println("Result: " +result);
        
        action.doubleClick(srcButton).pause(1000).contextClick(targetButton).pause(1000).build().perform();

        WebElement openMenuItem = driver.findElement(By.xpath("//span[text() = 'Open']"));
        //WebElement openMenuItem = driver.findElement(By.xpath("//span[text() = 'Open']"));

        action.click(openMenuItem).pause(1000).build().perform();
        result = driver.findElement(By.id("result")).getText();
        System.out.println("Result: " +result);
        
        driver.quit();
	}

}
