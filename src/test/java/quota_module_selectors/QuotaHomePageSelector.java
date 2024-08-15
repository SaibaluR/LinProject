package quota_module_selectors;

import org.openqa.selenium.By;

/**
 * xpaths for Quota Home Page
 *
 */
public class QuotaHomePageSelector {
	public static final By quotaTypeBtn = By.xpath("//p[@class='sideMenuName'][contains(text(),'Quota Type')]");
	public static final By linearityBtn = By.xpath("//p[@class='sideMenuName'][contains(text(),'Linearity')]");

}
