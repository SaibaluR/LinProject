package landingPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import hierarchy_module_pages.HierarchyHomePage;
import landingPage_selectors.HomePageSelector;
import quota_module_pages.QuotaHomePage;

public class HomePage extends Common {

	/*
	 * public HomePage(WebDriver driver) {
	 * 
	 * setDriver(driver); setWait(new WebDriverWait(driver, 60));
	 * PageFactory.initElements(driver, this);
	 * 
	 * }
	 */

	/**
	 * navigating to hierarchy module
	 */

	public HierarchyHomePage clickHierarchyBtn() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(HomePageSelector.hierarchyBtn));
		getDriver().findElement(HomePageSelector.hierarchyBtn).click();
		return new HierarchyHomePage();

	}

	/**
	 * navigating to Quota module
	 */
	public QuotaHomePage clickQuotaBtn() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(HomePageSelector.quotaBtn));
		getDriver().findElement(HomePageSelector.quotaBtn).click();
		return new QuotaHomePage();
	}

	/**
	 * Assertion for navigation towards hierarchy page
	 */
	public String checkHierarchyPage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(HomePageSelector.checkHierarchyPage));
		return getDriver().findElement(HomePageSelector.checkHierarchyPage).getText();
	}

	/**
	 * Assertion for navigation towards Quota page
	 */
	public String checkQuotaPage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(HomePageSelector.checkQuotaPage));
		return getDriver().findElement(HomePageSelector.checkQuotaPage).getText();
	}
}
