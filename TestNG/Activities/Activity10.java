package activities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/simple-form");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	public static List<List<String>> readExcel(String filepath) throws IOException {
		List<List<String>> data = new ArrayList<List<String>>();
		FileInputStream inputStream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (Row cells : sheet) {
			List<String> rowData = new ArrayList<String>();

			for (Cell cell : cells) {
				rowData.add(cell.getStringCellValue());
			}
			data.add(rowData);
		}
		inputStream.close();
		workbook.close();
		return data;
	}

	@DataProvider(name = "formData")
	public static Object[][] dataset() throws IOException {
		String filepath = "src/test/resources/dataset.xlsx";
		List<List<String>> data = readExcel(filepath);
		return new Object[][] { { data.get(1) }, { data.get(2) }, { data.get(3) } };
	}

	@Test(dataProvider = "formData")
	public void testSimpleForm(List<String> data) throws InterruptedException {
		driver.findElement(By.id("full-name")).sendKeys(data.get(0));
		driver.findElement(By.id("email")).sendKeys(data.get(1));
		driver.findElement(By.name("event-date")).sendKeys(data.get(2).replaceAll("\"", ""));
		driver.findElement(By.id("additional-details")).sendKeys(data.get(3));
		Thread.sleep(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(message, "Your event has been scheduled!");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
