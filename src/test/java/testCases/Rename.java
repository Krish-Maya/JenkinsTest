package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Rename_Page_Objects;



public class Rename extends CommonFunctions {
	Logger logger=Logger.getLogger(Rename.class);
	
	@Test
	public void changeName() throws InterruptedException 

	{
		PageFactory.initElements(driver,Rename_Page_Objects.class);
		 logger.info("dropdown click");
		
		Rename_Page_Objects.dropdown.click();
		Thread.sleep(3000);
		 logger.info("rename Application");
		Rename_Page_Objects.renameicon.click();
	  
	}

}
