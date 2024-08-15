package landingPage_selectors;

import org.openqa.selenium.By;

/**
 * xpaths for Login page
 *
 */
public class LoginPageSelector {
	public static final By userName = By.xpath("//input[@name='userName']");
	public static final By login = By.xpath("//button[@color='primary']");
	public static final By password = By.xpath("//span//input[@name='password']");
	public static final By finalLoginBtn = By.xpath("//input[@type='submit']");
	public static final By checkValidLogin = By.xpath("//p[@id='welcomeMsg']");
}
