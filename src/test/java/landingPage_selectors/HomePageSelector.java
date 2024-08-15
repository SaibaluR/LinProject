package landingPage_selectors;

import org.openqa.selenium.By;

/**
 * xpath selectors for Home Page
 * 
 */
public class HomePageSelector {

	public static final By hierarchyBtn = By.xpath("//div[@id='hierarchyBG']");
	public static final By checkHierarchyPage = By.xpath("//p[@id='fullText']");
	public static final By quotaBtn = By.xpath("//div[@id='quotaBG']");
	public static final By checkQuotaPage = By.xpath("//p[@id='fullText'][contains(text(),'Quota')]");

}
