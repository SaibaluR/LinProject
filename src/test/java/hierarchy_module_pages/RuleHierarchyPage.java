package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Common;
import hierarchy_module_selectors.RuleHierarchyPageSelectors;

public class RuleHierarchyPage extends Common {
	public String checkRuleHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(RuleHierarchyPageSelectors.checkRulePage));
		return getDriver().findElement(RuleHierarchyPageSelectors.checkRulePage).getText();
	}
}
