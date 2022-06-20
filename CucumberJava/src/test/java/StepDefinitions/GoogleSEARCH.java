package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;


public class GoogleSEARCH {
WebDriver driver=null;
	@Given("user launches the browser")
	public void user_launches_the_browser() {
	System.out.println("Inside step- user launched browser");
	System.setProperty("webdriver.chrome.driver", "C:/Users/broadway/Desktop/Capgemini/chromedriver.exe");
	driver= new ChromeDriver();



	driver.manage().window().fullscreen();
	}

	@When("user enters url")
	public void user_enters_url() {
		System.out.println("Inside step-user entered Url");
		driver.get("https://www.google.com/");
	}

	@Then("user is navigated to search page")
	public void user_is_navigated_to_search_page() {
		System.out.println("Inside step- user is navigated to search page");
		Assert.assertEquals("Google", driver.getTitle());
		
	}

	@And("user enters text in search bar and clicks on search")
	public void user_enters_text_in_search_bar_and_clicks_on_search() {
		System.out.println("Inside step- user entered text");
		driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
	}

	@Then("user gets results")
	public void user_gets_results() {
		System.out.println("Inside step- user got result");
		driver.getTitle();
		driver.close();
		driver.quit();
}
}
