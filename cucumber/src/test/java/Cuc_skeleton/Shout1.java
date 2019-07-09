package Cuc_skeleton;



import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Shout1 {
	
	Person saun=new Person();
	
	@Given("Saun is {int} meters away from Lucia")
	public void saun_is_meters_away_from_Lucia(Integer int1) {
	 saun.setDistance(int1);
	    
	}

	@When("Saun shouts {string}")
	public void saun_shouts(String string) {
	    saun.setMessage(string);
	    
	}

	@Then("Lucia (listens|cannot listen) to the message")
	public void lucia_listens_to_the_message() {
	  String message=saun.getMessage();
	  Assert.assertEquals("Free Coffee", message);
	  
	    
	}
	
}
