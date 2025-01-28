import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);

		driver.get("https://training-support.net/webelements/drag-drop");
		driver.manage().window().maximize();
		System.out.println("Title of the page: " +driver.getTitle());
		WebElement ball = driver.findElement(By.xpath("//img[@id='ball']"));
		WebElement dropZone1 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement dropZone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));

		action.clickAndHold(ball).pause(1000).moveToElement(dropZone1).release().build().perform();

		String dropZone1Text = dropZone1.getText();
		if(dropZone1Text.equals("Dropped!")) {
			System.out.println("Ball was dropped in Dropzone 1");
		}

		action.clickAndHold(ball).pause(1000).moveToElement(dropZone2).release().build().perform();

		String dropZone2Text = dropZone2.getText();
		if(dropZone2Text.equals("Dropped!")) {
			System.out.println("Ball was dropped in Dropzone 2");
		}

		driver.close();
	}
}
