package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

	WebDriver driver;
	@Given("url of testmeapp {string}")
	public void url_of_testmeapp(String string) {
		String chromePath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_eclipse\\jar\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver= new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getCurrentUrl().contains("RegisterUser"));
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
		
	}

	@When("user enters confirmpassword as {string}")
	public void user_enters_confirmpassword_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("user clicks gender as {string}")
	public void user_clicks_gender_as(String string) {
		driver.findElement(By.xpath("//input[@id='gender'][1]")).click();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("user enters mobilenumber as {string}")
	public void user_enters_mobilenumber_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("user enters DOB as {string}")
	public void user_enters_DOB_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@When("user selects sequrity question as {string}")
	public void user_selects_sequrity_question_as(String string) {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(1);
	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("the user is in login page")
	public void the_user_is_in_login_page() {
		driver.findElement(By.name("Submit")).click();
	}

}
