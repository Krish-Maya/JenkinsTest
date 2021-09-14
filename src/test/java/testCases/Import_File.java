package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import commonFunctions.CommonFunctions;
import pageObjects.Import_DataSource_Objects;
import pageObjects.Import_File_Page_Objects;
import pageObjects.Workspace_Objects;
import pageObjects.dataset_Page_Objects;

public class Import_File extends CommonFunctions {
	Logger logger=Logger.getLogger(Import_File.class);
	@Test
	public void importFile() throws AWTException, InterruptedException
	{
           try
           {
		  PageFactory.initElements(driver, Workspace_Objects.class);
		  PageFactory.initElements(driver, dataset_Page_Objects.class);
          PageFactory.initElements(driver, Import_DataSource_Objects.class);
		  PageFactory.initElements(driver, Import_File_Page_Objects.class);
		  logger.info("Going to Workplace ");
		  Thread.sleep(3000);
		 
		  Workspace_Objects.workspacelink.click();
		 
		  dataset_Page_Objects.addDataSet.click();
		  
		  Import_DataSource_Objects.files.click(); 
		
		  Import_File_Page_Objects.selectFiles.click(); 
		
		  logger.info("Going to DataSet");
		  StringSelection ss=new StringSelection("/home/local/ZOHOCORP/maya-con747/Downloads/Leads_Leads.csv");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		  Robot robot=new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(3000);
		  Import_File_Page_Objects.upload.click(); 
		  logger.info("click upload Import file");
		  TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File("/home/local/ZOHOCORP/maya-con747/Downloads/autotest");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile,DestFile);
           }
           catch(Exception ex)
           {
        	   logger.info("Error in Import file");
        	   ex.printStackTrace();
        	   
           }
	    
	}

}
