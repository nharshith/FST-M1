import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Title of the page: " +driver.getTitle());
		
		String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
		System.out.println("Third header text: " + thirdHeaderText );
		
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		System.out.println("RGB of fifth header: " + fifthHeaderColor.asRgb());
		System.out.println("Hex value of fifth header: " + fifthHeaderColor.asHex());

		String purpleButtonClasses = driver.findElement(By.className("bg-purple-200")).getDomAttribute("class");
		System.out.println("Classes of purple button: " + purpleButtonClasses);
		
		String slateButtonText = driver.findElement(By.className("bg-slate-200")).getText();
		System.out.println("Slate button text: " +slateButtonText);
		
		driver.quit();
	}
}
