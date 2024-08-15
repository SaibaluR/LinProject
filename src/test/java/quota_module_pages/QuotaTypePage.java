package quota_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import base.Common;
import quota_module_selectors.QuotaTypePageSelector;
import utils.ConfigLoader;

public class QuotaTypePage extends Common {

	/*
	 * public QuotaTypePage(WebDriver driver) { this.driver = driver; this.wait =
	 * new WebDriverWait(driver, 60); PageFactory.initElements(driver, this); }
	 */

	/**
	 * creating new Quota Type
	 * 
	 * @throws InterruptedException
	 */
	public QuotaTypePage createQuotaType() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(QuotaTypePageSelector.createTab));
		getDriver().findElement(QuotaTypePageSelector.createTab).click();
		int ran;
		ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));

		getDriver().findElement(QuotaTypePageSelector.quotaTypeName)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		getDriver().findElement(QuotaTypePageSelector.descriptionField)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		getDriver().findElement(QuotaTypePageSelector.rolledUp).click();
		Select drop = new Select(getDriver().findElement(QuotaTypePageSelector.granularityField));
		drop.selectByVisibleText("Account");

		getDriver().findElement(QuotaTypePageSelector.createBtn).click();

		return this;
	}

	/**
	 * edit the existing quota type
	 * 
	 * @throws InterruptedException
	 */
	public QuotaTypePage editQuotaType() throws InterruptedException {
		Thread.sleep(2000);
		getWait().until(ExpectedConditions.visibilityOfElementLocated(QuotaTypePageSelector.viewOrModifyTab));
		getDriver().findElement(QuotaTypePageSelector.viewOrModifyTab);
		getDriver().findElement(QuotaTypePageSelector.quotaTypeName).clear();
		getDriver().findElement(QuotaTypePageSelector.descriptionField).clear();
		int ran;
		ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));

		getDriver().findElement(QuotaTypePageSelector.quotaTypeName)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		getDriver().findElement(QuotaTypePageSelector.descriptionField)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		if (getDriver().findElement(QuotaTypePageSelector.checkBoxRolledUp).isSelected()) {
			Select drop = new Select(getDriver().findElement(QuotaTypePageSelector.granularityField));
			drop.selectByVisibleText("Territory");
		} else {
			getDriver().findElement(QuotaTypePageSelector.rolledUp).click();
			Select drop = new Select(getDriver().findElement(QuotaTypePageSelector.granularityField));
			drop.selectByVisibleText("Account");
		}

		getDriver().findElement(QuotaTypePageSelector.saveBtn).click();
		return this;
	}

	/***
	 * Success message assertion
	 */
	public String successMessage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(QuotaTypePageSelector.successMessage));
		return getDriver().findElement(QuotaTypePageSelector.successMessage).getText();
	}

}
