package comm.automation.pages;

import java.awt.HeadlessException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import comm.learnautomation.utility.BrowserFactory;
import comm.learnautomation.utility.ConfigDataProvider;
import comm.learnautomation.utility.ExcelDataProvider;
import comm.learnautomation.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider cnfg;

	@BeforeSuite
	public void setupSuite() {
		excel = new ExcelDataProvider();
		cnfg = new ConfigDataProvider();
	}

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, cnfg.getBrowser(), cnfg.getStagingUrl());
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	@AfterMethod
	public void teardownMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenShot(driver);
		}
	}

}
