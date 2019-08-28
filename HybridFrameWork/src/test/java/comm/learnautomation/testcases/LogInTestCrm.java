package comm.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import comm.automation.pages.CrmLogInPage;
import comm.learnautomation.utility.BrowserFactory;

public class LogInTestCrm {
	WebDriver driver;

	@Test
	public void loginApp() {
		driver = BrowserFactory.startApplication(driver, "chrome", "https://freecrm.com");
		CrmLogInPage logInPage = PageFactory.initElements(driver, CrmLogInPage.class);
		logInPage.logInCrm("Abc", "Xyz");
		BrowserFactory.quitBrowser(driver);
	}

}
