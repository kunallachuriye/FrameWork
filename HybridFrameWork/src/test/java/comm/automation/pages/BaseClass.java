package comm.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import comm.learnautomation.utility.BrowserFactory;
import comm.learnautomation.utility.ConfigDataProvider;
import comm.learnautomation.utility.ExcelDataProvider;

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

}
