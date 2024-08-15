package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Common;
import hierarchy_module_selectors.CoverageEditPageSelectors;

public class CoverageEditHierarchyPage extends Common {

	/**
	 * Setting up of coverage
	 * 
	 * @throws InterruptedException
	 */

	public CoverageEditHierarchyPage setCoverage() throws InterruptedException {

		if (checkCoverageEpression()) // checking if coverage expression is displayed or not
		{
			clearCoverage(); // if displayed, clearing the preset coverage,before adding it
			addCoverage();

		} else {
			addCoverage();
		}
		return this;

	}

	/**
	 * check the coverage expression
	 */
	public boolean checkCoverageEpression() {

		try {
			getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageEditPageSelectors.ruleExp));
			getDriver().findElement(CoverageEditPageSelectors.ruleExp).isDisplayed();
			return true;
		} catch (Exception e) {

			return false;
		}

	}

	/**
	 * Remove the existing coverage
	 */
	public CoverageEditHierarchyPage clearCoverage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageEditPageSelectors.minusBtn));
		getDriver().findElement(CoverageEditPageSelectors.minusBtn).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageEditPageSelectors.saveBtn));
		getDriver().findElement(CoverageEditPageSelectors.saveBtn).click();

		return this;
	}

	/**
	 * add the coverage
	 * 
	 * @throws InterruptedException
	 */
	public CoverageEditHierarchyPage addCoverage() throws InterruptedException {

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageEditPageSelectors.addBtn));

		Thread.sleep(6000);
		getDriver().findElement(CoverageEditPageSelectors.addBtn).click();

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageEditPageSelectors.countryDropDwn));
		getDriver().findElement(CoverageEditPageSelectors.countryDropDwn).click();

		Thread.sleep(4000);
		getDriver().findElement(CoverageEditPageSelectors.selectOption).click();

		getDriver().findElement(CoverageEditPageSelectors.outsideClick).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageEditPageSelectors.saveBtn));

		getDriver().findElement(CoverageEditPageSelectors.saveBtn).click();

		return this;

	}

	/**
	 * Assertion for setting up of coverage
	 */
	public String checkCoverageUpdation() {
		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(CoverageEditPageSelectors.checkSaveCoverageMessage));

		return getDriver().findElement(CoverageEditPageSelectors.checkSaveCoverageMessage).getText();
	}
}
