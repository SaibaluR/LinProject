package quota_module_selectors;

import org.openqa.selenium.By;

/**
 * xpaths for Quota Type Page
 *
 */
public class QuotaTypePageSelector {
	public static final By createTab = By.xpath("//div[@class='quotaTopTabsInActive']");
	public static final By quotaTypeName = By.xpath("(//input[@id='quotaPageTableInput'])[1]");
	public static final By descriptionField = By.xpath("(//textarea[@id='quotaPageTableInputSpecific'])[1]");
	public static final By rolledUp = By.xpath("(//td[@data-kendo-grid-column-index='4'])[1]");
	public static final By granularityField = By.xpath("(//select[@id='quotaPageSelect'])[1]");
	public static final By createBtn = By.xpath("//div[@id='newUiCreateButton']");

	public static final By viewOrModifyTab = By.xpath("//div[@class='quotaTopTabs']");
	public static final By checkBoxRolledUp = By.xpath("(//input[@id='quotaPageTableDataCheckbox'])[1]");
	public static final By saveBtn = By.xpath("//div[@id='newUiSaveButton']");
	public static final By successMessage = By.xpath("//div[@class='ui-growl-message']//span[@class='ui-growl-title']");

}
