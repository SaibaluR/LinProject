package quota_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import quota_module_selectors.QuotaHomePageSelector;

public class QuotaHomePage extends Common {
	/*
	 * public QuotaHomePage(WebDriver driver) { this.driver = driver; this.wait =
	 * new WebDriverWait(driver, 60); PageFactory.initElements(driver, this); }
	 */
	/**
	 * click quota type option
	 * 
	 */
	public QuotaTypePage clickQuotaTypePage() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(QuotaHomePageSelector.quotaTypeBtn));

		getDriver().findElement(QuotaHomePageSelector.quotaTypeBtn).click();
		return new QuotaTypePage();
	}

	/**
	 * navigate to Linearity Page
	 */
	public LinearityPage clickLinearityPage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(QuotaHomePageSelector.linearityBtn));
		getDriver().findElement(QuotaHomePageSelector.linearityBtn).click();
		return new LinearityPage();
	}

}
