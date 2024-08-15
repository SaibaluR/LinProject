package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import hierarchy_module_selectors.CockpitHierarchyPageSelectors;

public class CockpitHierarchyPage extends Common {

	/*
	 * public CockpitHierarchyPage(WebDriver driver) { this.driver = driver;
	 * this.wait = new WebDriverWait(driver, 60); PageFactory.initElements(driver,
	 * this); }
	 */

	/**
	 * Assertion for navigation towards hierarchy Compare page
	 */
	public String checkCockpitHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CockpitHierarchyPageSelectors.checkCockpitPage));
		return getDriver().findElement(CockpitHierarchyPageSelectors.checkCockpitPage).getText();
	}
}
