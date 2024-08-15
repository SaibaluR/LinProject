package quota_module_selectors;

import org.openqa.selenium.By;

/**
 * 
 * xpaths of Linearity Page
 *
 */
public class LinearityPageSelectors {

	public static final By viewOrModifyTab = By.xpath("//div[@class='quotaTopTabs']");
	public static final By createTab = By.xpath("//div[@class='quotaTopTabsInActive']");
	public static final By linearityName = By.xpath("(//input[@id='linearityPageTableInput'])[1]");
	public static final By fiscalPeriodTypeDrop = By.xpath("(//select[@id='linearityPageSelect'])[1]");
	public static final By linearityFieldSemi = By.xpath("(//input[@id='linearityPageTableInputSpecific2'])[1]");

	public static final By linearityFieldAnnual = By.xpath("(//input[@id='linearityPageTableInputSpecific1'])[1]");
	public static final By linearityFieldAnnualTwo = By.xpath("(//input[@id='linearityPageTableInputSpecific1'])[2]");
	public static final By saveBtn = By.xpath("//div[@id='newUiCreateButton']");
	public static final By editSaveBtn = By.xpath("//div[@id='newUiSaveButton']");
	public static final By successMessage = By.xpath("//div[@class='ui-growl-message']//span[@class='ui-growl-title']");
}
