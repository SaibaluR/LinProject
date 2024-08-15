package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Common;
import hierarchy_module_selectors.EmployeeHierarchyPageSelectors;

public class EmployeeHierarchyPage extends Common {

	/**
	 * Assertion for navigation towards hierarchy employee page
	 */
	public String checkEmployeeHierarchyPage() {

		getWait()
				.until(ExpectedConditions.visibilityOfElementLocated(EmployeeHierarchyPageSelectors.checkEmployeePage));

		return getDriver().findElement(EmployeeHierarchyPageSelectors.checkEmployeePage).getText();
	}
}
