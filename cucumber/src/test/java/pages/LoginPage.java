package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,using="Email")
	static public WebElement email;

	@FindBy(how=How.ID,using="Password")
	static public WebElement password;
	
	@FindBy(how=How.CSS,using="input[value='Log in']")
	static public WebElement signin;
	
	@FindBy(how=How.LINK_TEXT,using="Log out")
	static public WebElement signout;
	
}
