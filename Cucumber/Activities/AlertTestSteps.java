package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTestSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	Alert alert;
	
	@Given("User is on the page")
	public void user_is_on_the_page() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/alerts");
		driver.manage().window().maximize();
	}
	
	@When("User clicks the Simple Alert button")
	public void user_clicks_the_simple_alert_button() {
		driver.findElement(By.id("simple")).click();
	}
	
	@When("User clicks the Confirm Alert button")
	public void user_clicks_the_confirm_alert_button() {
		driver.findElement(By.id("confirmation")).click();
	}
	
	@When("User clicks the Prompt Alert button")
	public void user_clicks_the_prompt_alert_button() {
		driver.findElement(By.id("prompt")).click();
	}
	
	@Then("Alert opens")
	public void alert_opens() {
		alert = driver.switchTo().alert();
	}
	
	@And("Read the text from it and print it")
	public void read_the_text_from_it_and_print_it() {
		System.out.println("Text in the alert: " + alert.getText());
	}
	
	@And("Write a custom message in it")
	public void write_a_custom_message_in_it() {
		alert.sendKeys("Promt alert test");
	}
	
	@And("Close the alert")
	public void close_the_alert() {
		alert.accept();
	}
	
	@And("Close the alert with Cancel")
	public void close_the_alert_with_cancel() {
		alert.dismiss();
	}
	
	@And("Read the result text")
	public void read_the_result_text() {
		System.out.println("Result text: " + driver.findElement(By.id("result")).getText());
	}
	
	@And("Close Browser")
	public void close_browser() {
		driver.quit();
	}	
}
