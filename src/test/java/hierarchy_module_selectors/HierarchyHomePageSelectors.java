package hierarchy_module_selectors;

import org.openqa.selenium.By;

/**
 * xpaths for Hierarchy page
 *
 */
public class HierarchyHomePageSelectors {

	public static final By editBtn = By.xpath("//li[contains(@id,'showEditHierarchy')]");
	public static final By createBtn = By.xpath("//li[contains(@id,'showCreateHierarchy')]");
	public static final By compareBtn = By.xpath("//li[contains(@id,'showCompareHierarchy')]");
	public static final By reportBtn = By.xpath("//li[contains(@id,'showReports')]");
	public static final By cockpitBtn = By.xpath("//li[contains(@id,'showCockpit')]");
	public static final By accountsBtn = By
			.xpath("//li[contains(@id,'showViewHierarchy')]//p[contains(text(),'Accounts')]");

	public static final By ruleBtn = By.xpath("//li[contains(@id,'rule')]");
	public static final By employeeBtn = By.xpath("//li[contains(@id,'showEmployee')]");
	public static final By metricsBtn = By.xpath("//li[contains(@id,'showMetrics')]");
	public static final By publishBtn = By.xpath("//li[contains(@id,'showERP')]");
	public static final By overLay = By.xpath("//div[@class='backdrop full-screen']");

}
