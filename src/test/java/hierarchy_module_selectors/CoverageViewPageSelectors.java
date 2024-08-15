package hierarchy_module_selectors;

import org.openqa.selenium.By;

public class CoverageViewPageSelectors {

	public static final By addBtn = By
			.xpath("(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[1]");

	public static final By countryDropDwn = By.xpath("(//mat-select[contains(@id,\"mat-select\")])[3]");

	public static final By selectOption = By
			.xpath("//span[@class='mat-option-text'][contains(text(),' United States ')]");

	public static final By outsideClick = By.xpath(
			"//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']");

	public static final By saveBtn = By.xpath("//button[@class='button btn coverage_button']");

	public static final By ruleExp = By.xpath("//p[@style='display: inline;']");

	public static final By minusBtn = By.xpath(
			"//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'][contains(text(),'remove_circle_outline')]");

	public static final By accountIdSort = By.xpath("(//span[contains(@class,\"sortIcon\")])[1]");

	public static final By ascendingSort = By.xpath("(//span[(@class='sortIcon k-icon k-i-sort-asc-sm')])");

	public static final By descendingSort = By.xpath("(//span[(@class='sortIcon k-icon k-i-sort-desc-sm')])");

	public static final By accountNameSort = By.xpath("(//span[contains(@class,\"sortIcon\")])[2]");

	public static final By segmentSort = By.xpath("(//span[contains(@class,\"sortIcon\")])[4]");

	public static final By namedAccountSort = By.xpath("(//span[contains(@class,\"sortIcon\")])[5]");

	public static final By postalCodeSort = By.xpath("(//span[contains(@class,\"sortIcon\")])[6]");

	public static final By accountIdFilter = By.xpath("//a[@title='Account Id Filter Menu']");

	public static final By accountNameFilter = By.xpath("//a[@title='Account Name Filter Menu']");

	public static final By segmentFilter = By.xpath("//a[@title='Segment Filter Menu']");

	public static final By postalFilter = By.xpath("//a[@title='Postal Code Filter Menu']");

	public static final By horizontalScroll = By.xpath("//span[contains(text(),'Coverage Accounts')]");

	public static final By scroll = By.xpath("//span[contains(text(),'Score')]");

	public static final By postalFilterOption = By.xpath("//span[contains(text(),' 02881-1974')]");

	public static final By mapBtn = By.xpath("//button[contains(text(),' Map View ')]");

	public static final By segmentFilterOption = By.xpath("//span[contains(text(),' Majors')]");

	public static final By accountIdFilterOption = By.xpath("//span[contains(text(),' 0010z00001b5UogAAE')]");

	public static final By accountNameFilterOption = By
			.xpath("//span[contains(text(),' Alexandria Real Estate Equities, Inc.')]");

	public static final By filterOkBtn = By.xpath("//button[@id='filterOkBtn']");

	public static final By clearBtn = By.xpath("//a[contains(text(),'Clear')]");

	/**
	 * Assertions
	 */

	public static final By checkSaveCoverageMessage = By
			.xpath("//div[@class='ui-growl-message']//span[contains(text(),'Node Coverage updated Successfully')]");

	public static final By accountIdAscendingOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'0010z00001b51SQAAY')]");

	public static final By accountIdDescendingOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'0016000000p6wLWAAY')]");

	public static final By accountIdDefaultCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'0010z00001S55EaAAJ')]");

	public static final By accountNameAscendingOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'Acme Tools Bemidji')]");

	public static final By accountNameDescendingOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'Zwift, Inc.')]");

	public static final By accountNameDefaultCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'Cybergrx, Inc.')]");

	public static final By segmentAscendingOrderCheck = By
			.xpath("(//span[@filter='numeric'][contains(text(),'Commercial (CML)')])[1]");

	public static final By segmentDescendingOrderCheck = By
			.xpath("(//span[@filter='numeric'][contains(text(),'Mid-Market (MM)')])[1]");

	public static final By segmentDefaultCheck = By
			.xpath("(//span[@filter='numeric'][contains(text(),'Commercial (CML)')])[1]");

	public static final By namedAccountAscendingOrderCheck = By
			.xpath("(//span[@filter='numeric'][contains(text(),'No')])[1]");

	public static final By namedAccountDescendingOrderCheck = By
			.xpath("(//span[@filter='numeric'][contains(text(),'Yes')])[1]");

	public static final By namedAccountDefaultOrderCheck = By
			.xpath("(//span[@filter='numeric'][contains(text(),'Yes')])[1]");

	public static final By postalCodeAscendingOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'02035-2443')]");

	public static final By postalCodeDescendingOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'99224-9446')]");

	public static final By postalCodeDefaultOrderCheck = By
			.xpath("//span[@filter='numeric'][contains(text(),'80202-2991')]");

	public static final By accountIdFilterCheck = By.xpath("//span[contains(text(),'0010z00001b5UogAAE')]");

	public static final By accountNameFilterCheck = By
			.xpath("//span[contains(text(),'Alexandria Real Estate Equities, Inc.')]");

	public static final By segmentFilterCheck = By.xpath("//span[contains(text(),'Majors')]");

	public static final By postalFilterCheck = By.xpath("//span[contains(text(),'02881-1974')]");
}
