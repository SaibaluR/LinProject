package landingPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import base.Common;
import landingPage_selectors.LoginPageSelector;
import utils.ConfigLoader;

public class LoginPage extends Common {

	/*
	 * public LoginPage(WebDriver driver) {
	 * 
	 * setDriver(driver); setWait(new WebDriverWait(driver, 60));
	 * PageFactory.initElements(driver, this); }
	 */

	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * loading the login page
	 *
	 */
	public LoginPage load() {

		load("/");

		return this;
	}

	/**
	 * valid login
	 * 
	 * @throws InterruptedException
	 */
	public HomePage validLogin() throws InterruptedException {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(LoginPageSelector.userName));
		getDriver().findElement(LoginPageSelector.userName).sendKeys(ConfigLoader.getConfigProperty("username"));
		getDriver().findElement(LoginPageSelector.login).click();
		getDriver().switchTo().activeElement();

		// getWait().until(ExpectedConditions.visibilityOfElementLocated(LoginPageSelector.password));
		Thread.sleep(3000);
		getDriver().findElement(LoginPageSelector.password).sendKeys(ConfigLoader.getConfigProperty("password"));
		getDriver().findElement(LoginPageSelector.finalLoginBtn).click();

		Reporter.log("Successfully logged in");
		return new HomePage();
	}

	/**
	 * Assertion for valid login
	 */

	public String validLoginCheck() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(LoginPageSelector.checkValidLogin));
		return getDriver().findElement(LoginPageSelector.checkValidLogin).getText();

	}

}
