package hierarchy_module_pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import hierarchy_module_selectors.CreateHierarchyPageSelectors;
import hierarchy_module_selectors.HierarchyHomePageSelectors;
import utils.ConfigLoader;
import utils.FileUploader;

public class CreateHierarchyPage extends Common {
	/**
	 * Function to upload a hierarchy with a valid data
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CreateHierarchyPage createNewHierarchyWithValidFile() throws InterruptedException {

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.viewOrModify));

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.CreateTab));

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getDriver().findElement(CreateHierarchyPageSelectors.CreateTab).click();

		// checking whether the sales radio button is checked or not

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.salesRadioButton));

		if (getDriver().findElement(CreateHierarchyPageSelectors.salesRadioButton).isEnabled()) {

			int ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));
			getDriver().findElement(CreateHierarchyPageSelectors.hierarchyNameFieldBox)
					.sendKeys(ConfigLoader.getTestDataProperty("createHierarchy") + ran);
		}

		getDriver().findElement(CreateHierarchyPageSelectors.nextBtn).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.nextBtnDrop));

		Thread.sleep(4000);

		getDriver().findElement(CreateHierarchyPageSelectors.nextBtnDrop).click();

		// file uploading code, need to give the file name and xpath

		FileUploader.fileUpload("Hierarchy Sample file.csv", CreateHierarchyPageSelectors.fileUploadBtn);

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.validateBtn));

		getDriver().findElement(CreateHierarchyPageSelectors.validateBtn).click();

		getWait().until(ExpectedConditions
				.visibilityOfElementLocated(CreateHierarchyPageSelectors.checkUploadSuccessfulMessage));

		getDriver().findElement(CreateHierarchyPageSelectors.saveBtn).click();

		return this;
	}

	/**
	 * Function to upload a hierarchy with a invalid data
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CreateHierarchyPage createNewHierarchyWithInvalidFile() throws InterruptedException {

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.viewOrModify));

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.CreateTab));

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getDriver().findElement(CreateHierarchyPageSelectors.CreateTab).click();

		// checking whether the sales radio button is checked or not

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.salesRadioButton));

		if (getDriver().findElement(CreateHierarchyPageSelectors.salesRadioButton).isEnabled()) {

			int ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));
			getDriver().findElement(CreateHierarchyPageSelectors.hierarchyNameFieldBox)
					.sendKeys(ConfigLoader.getTestDataProperty("createHierarchy") + ran);
		}

		getDriver().findElement(CreateHierarchyPageSelectors.nextBtn).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.nextBtnDrop));

		Thread.sleep(4000);

		getDriver().findElement(CreateHierarchyPageSelectors.nextBtnDrop).click();

		// file uploading code, need to give the file name and xpath

		FileUploader.fileUpload("Hierarchy Invalid file.csv", CreateHierarchyPageSelectors.fileUploadBtn);

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.validateBtn));

		getDriver().findElement(CreateHierarchyPageSelectors.validateBtn).click();

		return this;
	}

	/**
	 * Function to upload a hierarchy with a empty file
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CreateHierarchyPage emptyFileUpload() throws InterruptedException {

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.viewOrModify));

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.CreateTab));

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		getDriver().findElement(CreateHierarchyPageSelectors.CreateTab).click();

		// checking whether the sales radio button is checked or not

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.salesRadioButton));

		if (getDriver().findElement(CreateHierarchyPageSelectors.salesRadioButton).isEnabled()) {

			int ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));
			getDriver().findElement(CreateHierarchyPageSelectors.hierarchyNameFieldBox)
					.sendKeys(ConfigLoader.getTestDataProperty("createHierarchy") + ran);
		}

		getDriver().findElement(CreateHierarchyPageSelectors.nextBtn).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.nextBtnDrop));

		Thread.sleep(4000);

		getDriver().findElement(CreateHierarchyPageSelectors.nextBtnDrop).click();

		// file uploading code, need to give the file name and xpath

		FileUploader.fileUpload("Empty File.csv", CreateHierarchyPageSelectors.fileUploadBtn);

		// getWait().until(ExpectedConditions.elementToBeClickable(CreateHierarchyPageSelectors.validateBtn));

		// getDriver().findElement(CreateHierarchyPageSelectors.validateBtn).click();

		return this;
	}

	/**
	 * Assertion for valid hierarchy upload
	 */
	public String checkValidUpload() {

		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.verifyValidFileUpload));

		return getDriver().findElement(CreateHierarchyPageSelectors.verifyValidFileUpload).getText();
	}

	/**
	 * Assertion for invalid hierarchy upload
	 */
	public Boolean checkInvalidUpload() {

		getWait()
				.until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.verifyInvalidUpload));

		return getDriver().findElement(CreateHierarchyPageSelectors.verifyInvalidUpload).isDisplayed();
	}

	/**
	 * Assertion for empty hierarchy upload
	 */
	public Boolean checkEmptyFileUpload() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.emptyFileAssert));

		return getDriver().findElement(CreateHierarchyPageSelectors.emptyFileAssert).isDisplayed();
	}

	/**
	 * Assertion for navigation towards hierarchy Create page
	 */
	public String checkCreateHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CreateHierarchyPageSelectors.checkCreatePage));

		return getDriver().findElement(CreateHierarchyPageSelectors.checkCreatePage).getText();
	}

}
