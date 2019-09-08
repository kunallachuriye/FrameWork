package comm.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import comm.automation.pages.BaseClass;
import comm.automation.pages.CrmLogInPage;
import comm.learnautomation.utility.ExcelDataProvider;

public class LogInTestCrm extends BaseClass {

	@Test
	public void loginApp() {
		ExcelDataProvider excel = new ExcelDataProvider();
		CrmLogInPage logInPage = PageFactory.initElements(driver, CrmLogInPage.class);
		logInPage.logInCrm(excel.getStringData("Log", 0, 0), excel.getStringData("Log", 0, 1));

	}

}
