package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Common;
import hierarchy_module_selectors.HierarchyHomePageSelectors;
import hierarchy_module_selectors.MetricsHierarchyPageSelectors;

public class MetricHierarchyPage extends Common {

	/**
	 * Assertion for navigation towards hierarchy employee page
	 * 
	 * @throws InterruptedException
	 */
	public String checkMetricsHierarchyPage() throws InterruptedException {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MetricsHierarchyPageSelectors.checkMetricPage));

		return getDriver().findElement(MetricsHierarchyPageSelectors.checkMetricPage).getText();

	}
}
