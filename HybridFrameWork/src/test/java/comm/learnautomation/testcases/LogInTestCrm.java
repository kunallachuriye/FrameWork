package comm.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import comm.automation.pages.BaseClass;
import comm.automation.pages.CrmLogInPage;

public class LogInTestCrm extends BaseClass {

	@Test
	public void loginApp() {

		CrmLogInPage logInPage = PageFactory.initElements(driver, CrmLogInPage.class);
		logInPage.logInCrm("Abc", "Xyz");

	}

}
