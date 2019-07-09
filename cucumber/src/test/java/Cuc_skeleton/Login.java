package Cuc_skeleton;



import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login {

	WebDriver driver;
	@io.cucumber.java.Before
	public void init()
	{
		System.out.println("In before scenario");
		String chromePath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_eclipse\\jar\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,LoginPage.class);
	}
	
	@After
	public void destroy()
	{
		System.out.println("In after scenario");
		driver.close();
	}
	
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
		
		driver.get(string);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		//driver.findElement(By.xpath("//a[@href='/login']")).click();
	   
	}
	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
		
		LoginPage.email.sendKeys(string);
	   
	}


	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    
		LoginPage.password.sendKeys(string);
	}

	@Then("user is in webshop as {word}")
	public void user_is_in_webshop(String type) {
		
		LoginPage.signin.click();
		//Assert.assertTrue(LoginPage.signout.isDisplayed());
	}
	
	@Given("Admin of the test me app enters")
	public void admin_of_the_test_me_app_enters(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
		java.util.List<java.util.List<String>> list=dataTable.asLists();
		for(java.util.List<String> strings:list)
		{
			for(String s:strings)
			{
				System.out.println(s+"\t");
			}
			System.out.println("");
		}
		
	}	
	
		
	
}
