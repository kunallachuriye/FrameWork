package comm.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrmLogInPage {
	WebDriver driver;

	public CrmLogInPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//span[text()='Log In']/parent::a")
	WebElement HompePageLogIn;
	@FindBy(xpath = "//input[@name='email']")
	WebElement LogInUserName;
	@FindBy(xpath = "//input[@type='password']")
	WebElement LogInPassword;
	@FindBy(xpath = "//div[text()='Login']")
	WebElement LogInButton;

	public void logInCrm(String uname, String pwd) {
		HompePageLogIn.click();
		LogInUserName.sendKeys(uname);
		LogInPassword.sendKeys(pwd);
		LogInButton.click();
	}
}
