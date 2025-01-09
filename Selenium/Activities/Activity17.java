import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Title of the page: " +driver.getTitle());
		
		WebElement multiSelectDropDown = driver.findElement(By.xpath("//select[contains(@class, 'h-80')]"));
		
		Select multiSelect = new Select(multiSelectDropDown);
		
		multiSelect.deselectByIndex(0);
		multiSelect.selectByVisibleText("HTML");
		multiSelect.selectByIndex(3);
		multiSelect.selectByIndex(4);
		multiSelect.selectByIndex(5);
		multiSelect.selectByValue("nodejs");
		multiSelect.deselectByIndex(4);
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
		driver.quit();
	}
}
