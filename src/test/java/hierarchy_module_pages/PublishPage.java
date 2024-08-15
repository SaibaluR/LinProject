package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Common;
import hierarchy_module_selectors.PublishHierarchyPageSelectors;

public class PublishPage extends Common {

	/**
	 * Assertion for navigation towards hierarchy employee page
	 */
	public String checkPublishHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(PublishHierarchyPageSelectors.checkPublishPage));

		return getDriver().findElement(PublishHierarchyPageSelectors.checkPublishPage).getText();
	}

}
