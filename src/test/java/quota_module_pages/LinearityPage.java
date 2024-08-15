package quota_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import base.Common;
import quota_module_selectors.LinearityPageSelectors;
import utils.ConfigLoader;

public class LinearityPage extends Common {

	/*
	 * public LinearityPage(WebDriver driver) { this.driver = driver; this.wait =
	 * new WebDriverWait(driver, 60); PageFactory.initElements(driver, this); }
	 */

	/**
	 * creating Linearity
	 */
	public LinearityPage createLinearity() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(LinearityPageSelectors.createTab));
		getDriver().findElement(LinearityPageSelectors.createTab).click();
		getWait().until(ExpectedConditions.visibilityOfElementLocated(LinearityPageSelectors.linearityName));
		int ran;
		ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));
		getDriver().findElement(LinearityPageSelectors.linearityName)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		Select drop = new Select(getDriver().findElement(LinearityPageSelectors.fiscalPeriodTypeDrop));
		drop.selectByVisibleText("Semi Annual");

		getDriver().findElement(LinearityPageSelectors.linearityFieldSemi).clear();
		getDriver().findElement(LinearityPageSelectors.linearityFieldSemi)
				.sendKeys(ConfigLoader.getTestDataProperty("linearityNum"));

		getDriver().findElement(LinearityPageSelectors.saveBtn).click();

		return this;
	}

	/**
	 * edit linearity
	 */
	public LinearityPage editLinearity() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(LinearityPageSelectors.viewOrModifyTab));
		getDriver().findElement(LinearityPageSelectors.viewOrModifyTab).click();
		getWait().until(ExpectedConditions.visibilityOfElementLocated(LinearityPageSelectors.linearityName));
		getDriver().findElement(LinearityPageSelectors.linearityName).clear();
		int ran;
		ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));
		getDriver().findElement(LinearityPageSelectors.linearityName)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		Select drop = new Select(getDriver().findElement(LinearityPageSelectors.fiscalPeriodTypeDrop));
		drop.selectByVisibleText("Annual");

		getDriver().findElement(LinearityPageSelectors.linearityFieldAnnual).clear();
		getDriver().findElement(LinearityPageSelectors.linearityFieldAnnualTwo).clear();
		getDriver().findElement(LinearityPageSelectors.linearityFieldAnnual)
				.sendKeys(ConfigLoader.getTestDataProperty("linearityNumOne"));

		getDriver().findElement(LinearityPageSelectors.editSaveBtn).click();
		return this;
	}

	/***
	 * Success message assertion
	 */
	public String successMessage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(LinearityPageSelectors.successMessage));
		return getDriver().findElement(LinearityPageSelectors.successMessage).getText();
	}
}
