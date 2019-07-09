package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginn {

	WebDriver driver;
	@Given("url  {string}")
	public void url(String string) {
		String chromePath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_eclipse\\jar\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver= new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}

	@When("person types {string} as username")
	public void person_types_as_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("person types {string} as password")
	public void person_types_as_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
		
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		driver.findElement(By.name("Login")).click();
		Assert.assertTrue(driver.findElement(By.linkText("SignOut")).isDisplayed());
	}

}
