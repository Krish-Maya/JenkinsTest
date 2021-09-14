package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Import_DataSource_Objects {

	@FindBy(xpath="//*[@id=\'zsl_choose_datasource\']/div/div[1]/li[2]")
	public static WebElement files;
}
