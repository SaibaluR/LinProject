package hierarchy_module_selectors;

import org.openqa.selenium.By;

public class CreateHierarchyPageSelectors {

	public static final By viewOrModify = By.xpath("//a[contains(text(),' View / Modify ')]");

	public static final By CreateTab = By.xpath("//a[contains(text(),' Create ')]");

	public static final By salesRadioButton = By.xpath("//div[@id='1']");

	public static final By hierarchyNameFieldBox = By
			.xpath("//input[@class='commonInputTextbox ng-untouched ng-pristine ng-valid']");

	public static final By nextBtn = By
			.xpath("//button[@class='mat-raised-button mat-button-base mat-primary ng-star-inserted']");

	public static final By nextBtnDrop = By.xpath("//i[@class='material-icons'][contains(text(),'arrow_forward')]");

	public static final By dropAttributeBox = By.xpath("//div[@class='rightsideHeader']");

	public static final By fileUploadBtn = By.xpath("//input[@id='file']");

	public static final By overLay = By.xpath("//div[@class='backdrop full-screen']");

	public static final By validateBtn = By.xpath("//button[@id='createButton']");

	public static final By saveBtn = By.xpath("//button[@id='createSaveButton']");

	/**
	 * Assertion Selectors
	 */

	public static final By checkCreatePage = By
			.xpath("//div[@class='typesHeader']//p[contains(text(),'Create Hierarchy')]");

	public static final By checkUploadSuccessfulMessage = By
			.xpath("//span[@class='ui-growl-title'][contains(text(),'Successfully Validated')]");

	public static final By verifyValidFileUpload = By.xpath(
			"//p[contains(text(),'Congratulations! You have successfully created a new hierarchy. If you would like to edit the hierarchy, please continue in EDIT mode.')]");

	public static final By verifyInvalidUpload = By.xpath("//td[@style='color: red;']");

	public static final By emptyFileAssert = By
			.xpath("//span[@class='ui-growl-title'][contains(text(),'Empty file is uploaded')]");
}
