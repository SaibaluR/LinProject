package hierarchy_module_selectors;

import org.openqa.selenium.By;

public class CoverageEditPageSelectors {

	public static final By ruleExp = By.xpath("//p[@style='display: inline;']");

	public static final By minusBtn = By.xpath(
			"//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'][contains(text(),'remove_circle_outline')]");

	public static final By saveBtn = By.xpath("//button[@class='button btn coverage_button']");

	public static final By addBtn = By
			.xpath("(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[1]");

	public static final By countryDropDwn = By.xpath("(//mat-select[contains(@id,\"mat-select\")])[3]");

	public static final By selectOption = By
			.xpath("//span[@class='mat-option-text'][contains(text(),' United States ')]");

	public static final By outsideClick = By.xpath(
			"//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']");

	/**
	 * Assertions
	 */

	public static final By checkSaveCoverageMessage = By
			.xpath("//div[@class='ui-growl-message']//span[contains(text(),'Node Coverage updated Successfully')]");

}
