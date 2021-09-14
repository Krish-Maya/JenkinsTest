package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dataset_Page_Objects {
	
		
		@FindBy(id="zsl_add_dataset")
		public static WebElement addDataSet;
			@FindBy(partialLinkText="Deals")
	   public static WebElement datasetlink;
		

}
