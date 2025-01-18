package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("User is on Login page")
	public void user_i_on_login_page() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
		driver.manage().window().maximize();
	}
	
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
	}
	
	@When("User enters {string} and {string} from example")
	public void user_enters_username_and_password_from_example(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
	}
	
	@Then("Read the page title and confirmation message")
	public void read_the_page_title_and_confirmation_message() {
		String title = driver.getTitle();
		String message = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("Title of the page: " +title);
		System.out.println("Success Message: " +message);
	}
	
	@And("Close the Browser")
	public void close_the_browser() {
		driver.quit();
	}
}
