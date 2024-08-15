package hierarchy_module_selectors;

import org.openqa.selenium.By;

/**
 * xpaths for Edit page
 *
 */
public class EditHierarchyPageSelectors {

	public static final By getHierarchy = By
			.xpath("//div[@class='detailTypesList']//p[contains(text(),'Automation hierarchy')]");

	public static final By getViewVersion = By
			.xpath("//div[@class='detailTypesList']//p[contains(text(),' View Page Test Version')]");

	public static final By getEditVersion = By
			.xpath("//div[@class='detailTypesList']//p[contains(text(),' Edit Page Test Version')]");

	public static final By confirmBtn = By.xpath("//p[@id='confirm_button'][contains(text(),' Confirm ')]");

	public static final By selectTree = By.xpath("//div[@id='manageEditTree_2']");
	public static final By selectVersion = By.xpath("//div[@id='manageViewTree_0']");
	public static final By addNode = By.xpath("//li[@id='tooltip']//p[contains(text(),'Add Child Node')]");
	public static final By nodeNameField = By.xpath("//input[@id='newnodename_0']");
	public static final By originalNameField = By.xpath("//input[@id='newnodename_1']");
	public static final By overLay = By.xpath("//div[@class='backdrop full-screen']");
	public static final By drop = By.xpath("//select[@id='newnodename_3']");
	public static final By calendarBtn = By.xpath("//span[@class='ng-tns-c4-6 ui-calendar ui-calendar-w-btn']");
	public static final By calendarDrop = By
			.xpath("//select[@class='ui-datepicker-year ng-tns-c4-6 ng-star-inserted']");
	public static final By clickDate = By
			.xpath("//td[@class='ng-tns-c4-6 ng-star-inserted']//a[contains(text(),'27')]");
	public static final By saveBtn = By.xpath("//div[@class='tabButtons']//p[@class='saveButton']");
	public static final By searchField = By.xpath("//input[@placeholder='Search a node']");
	public static final By checkNode = By.xpath("//div[@id='duplicatecount']");

	public static final By addCoverageBtn = By.xpath("//button[@class='add_coverage_button_edit']");
	public static final By addBtn = By.xpath("(//button[@type='button'])[1]");
	public static final By countryDrop = By.xpath("(//div[@class='mat-select-trigger'])[3]");
	public static final By selectCountry = By.xpath("//span[@class='mat-option-text']");
	public static final By stateDrop = By.xpath("(//div[@class='mat-select-trigger'])[6]");
	public static final By selectState = By
			.xpath("//div[@class='cdk-overlay-pane']//span[contains(text(),'American Samoa')]");

	public static final By saveCoverageBtn = By.xpath("//button[@class='button btn coverage_button']");

	public static final By nodeLevel4Btn = By
			.xpath("//*[name()='svg']//*[local-name()='g' ]//*[contains(text(),'L4')]");

	public static final By level4Node = By
			.xpath("(//*[name()='svg']//*[local-name()='g']//*[local-name()='circle'])[121]");

	public static final By leafNode = By
			.xpath("(//*[name()='svg']//*[local-name()='g']//*[local-name()='circle'])[127]");

	public static final By defineCoverageTab = By
			.xpath("//p[@title='Define Coverage'][contains(text(),'Define Coverage')]");

	public static final By addOrEditCoverageBtn = By.xpath("//button[@class='add_coverage_button_edit']");

	public static final By versionBtn = By.xpath("//p[@id='hierarchy_saveasnew']");

	public static final By newVersionCheck = By.xpath("//p[@id='newTag'][@class='ng-star-inserted']");

	public static final By deleteIcon = By.xpath("(//div[@class='detailTypeImage ng-star-inserted'])[1]");
	public static final By deleteIconView = By.xpath("(//div[@class='detailTypeImage'])[1]");
	public static final By yesIcon = By.xpath("(//button[@class='dialog_box1'][contains(text(),'Yes')])[1]");

	public static final By successMessage = By.xpath("//div[@class='ui-growl-message']//span[@class='ui-growl-title']");

	public static final By checkEditPage = By.xpath("//div[@class='typesHeader']//p[contains(text(),'Edit')]");

	public static final By checkPending = By.xpath("//p[contains(text(),'PENDING')]");

}
