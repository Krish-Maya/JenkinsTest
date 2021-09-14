package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Rename_Page_Objects {
	@FindBy(xpath="//*[@id='zsgrid__1626156331782__column-header']/div/div[3]/div[1]/div[2]/span[3]")
	public static WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\'zsl_context_dropdown\']/div[1]/div[3]/svg")
	public static WebElement renameicon;
	//Transform
	@FindBy(xpath="//*[@id=\'zdp_dataprep_header_sec\']/div/div[4]/ul[1]/li[1]")
	public static WebElement column;
	@FindBy(id="zsl_deduplicate_menu")
	public static WebElement selectDuplicate;
	@FindBy(id="zsl_deduplicate_columnwise")
	public static WebElement selectDuplicate_column;
	@FindBy(xpath="//*[@id='zsl_transform_form_content']/li[1]/li/div[2]/div/input[1]")
	public static WebElement fill;
	@FindBy(id="zsl_operation_panel_preview")
	public static WebElement preview;
	@FindBy(id="zsl_operation_panel_apply_button")
	public static WebElement apply;
	
	
	
	
	
	

}
