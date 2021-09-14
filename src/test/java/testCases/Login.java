package testCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import commonFunctions.CommonFunctions;
import pageObjects.Login_Page_Objects;

public class Login extends CommonFunctions {
	Logger logger=Logger.getLogger(Login.class);
     @Test
	public void verfiyLogin()
	{
    	 Actions ac=new Actions(driver);
	  PageFactory.initElements(driver, Login_Page_Objects.class);
	  logger.info("Login to the Application");
	  Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
	  ac.sendKeys(Keys.ENTER).build().perform();
      Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
      ac.sendKeys(Keys.ENTER).build().perform();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
