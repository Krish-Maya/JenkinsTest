package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Rename_Page_Objects;
//import pageObjects.Workspace_Objects;
//import pageObjects.dataset_Page_Objects;

public class DeDuplicate extends CommonFunctions {
	Logger logger=Logger.getLogger(DeDuplicate.class);
	@Test
	public void deduplicateColumn() throws InterruptedException, AWTException, IOException
	{
		
	//	PageFactory.initElements(driver,Workspace_Objects.class);
		//PageFactory.initElements(driver,dataset_Page_Objects.class);
		PageFactory.initElements(driver,Rename_Page_Objects.class);
		//  Workspace_Objects.workspacelink.click();
			 
		//  dataset_Page_Objects.datasetlink.click();
		Rename_Page_Objects.column.click();
		Actions action=new Actions(CommonFunctions.driver);
		action.moveToElement(Rename_Page_Objects.selectDuplicate);
		action.moveToElement(Rename_Page_Objects.selectDuplicate_column);
		logger.info("column click");
		action.click().build().perform();
		logger.info("sendkeys click1");
		//Rename_Page_Objects.selectDuplicate_column.click();
		Thread.sleep(3000);
		logger.info("sendkeys click");
		Rename_Page_Objects.fill.sendKeys("coun");
		logger.info("sendkeys click3");
		Robot robot=new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		Rename_Page_Objects.preview.click();
		Thread.sleep(10000);
		Rename_Page_Objects.apply.click();
		Thread.sleep(3000);
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
          File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
          File DestFile=new File("/home/local/ZOHOCORP/maya-con747/Downloads/autotest1");
            FileUtils.copyFile(SrcFile,DestFile);
		
		
		
	}

}
