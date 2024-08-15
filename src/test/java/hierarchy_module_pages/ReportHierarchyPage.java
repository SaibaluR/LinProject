package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import hierarchy_module_selectors.ReportHierarchyPageSelectors;

public class ReportHierarchyPage extends Common {

	/*
	 * public ReportHierarchyPage(WebDriver driver) {
	 * 
	 * this.driver = driver; this.wait = new WebDriverWait(driver, 60);
	 * PageFactory.initElements(driver, this); }
	 */

	/**
	 * Assertion for navigation towards hierarchy Report page
	 */
	public String checkReportHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ReportHierarchyPageSelectors.checkReportPage));
		return getDriver().findElement(ReportHierarchyPageSelectors.checkReportPage).getText();
	}
}
