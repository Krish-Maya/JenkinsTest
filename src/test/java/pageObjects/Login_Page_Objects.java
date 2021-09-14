package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login_Page_Objects {
	@FindBy(id="login_id")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="nextbtn")
	public static WebElement nextButton;

	

}
