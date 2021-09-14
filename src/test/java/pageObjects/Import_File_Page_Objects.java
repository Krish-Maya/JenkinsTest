package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Import_File_Page_Objects {
	@FindBy(xpath="//*[@id=\'zsl_left_wrapper\']/div[3]/div/div/div[1]/div[2]/form/label")
	public static WebElement selectFiles;
	@FindBy(xpath="//button[@class='zsl_btn zsl_blue_btn']")
	public static WebElement upload;

}
