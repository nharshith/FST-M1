import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		driver.manage().window().maximize();
		System.out.println("Title of the page: " +driver.getTitle());

		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
		System.out.println("Number of rows: " +rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		System.out.println("Number of columns: " +cols.size());

		String bookName = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]")).getText();
		System.out.println("Book name from 5 row: " +bookName);

		driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th[5]")).click();
		bookName = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]")).getText();
		System.out.println("Book name from 5 row: " +bookName);

		driver.close();
	}
}
