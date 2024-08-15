package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import hierarchy_module_selectors.CompareHierarchyPageSelectors;

public class CompareHierarchyPage extends Common {

	/*
	 * public CompareHierarchyPage(WebDriver driver) {
	 * 
	 * this.driver = driver; this.wait = new WebDriverWait(driver, 60);
	 * PageFactory.initElements(driver, this); }
	 */

	/**
	 * Assertion for navigation towards hierarchy Compare page
	 */
	public String checkCompareHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CompareHierarchyPageSelectors.checkComparePage));
		return getDriver().findElement(CompareHierarchyPageSelectors.checkComparePage).getText();
	}

}
