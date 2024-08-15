package hierarchy_module_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import base.Common;
import hierarchy_module_selectors.EditHierarchyPageSelectors;
import utils.ConfigLoader;
import utils.SeleniumUtils;

public class EditHierarchyPage extends Common {

	/*
	 * public EditHierarchyPage(WebDriver driver) { this.driver = driver; this.wait
	 * = new WebDriverWait(driver, 60); PageFactory.initElements(driver, this); }
	 */
	/**
	 * loading the edit page
	 *
	 */
	public EditHierarchyPage load() {

		load("/hierarchy/editHierarchy");
		return this;
	}

	/**
	 * move the pending version to confirmed
	 * 
	 * @throws Exception
	 * 
	 */

	public ViewHierarchyPage moveToConfirm() throws Exception {

		if (confirmation() == true) {

			getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.getHierarchy));
			getDriver().findElement(EditHierarchyPageSelectors.getHierarchy).click();

			getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.getViewVersion));
			getDriver().findElement(EditHierarchyPageSelectors.getViewVersion).click();

			Thread.sleep(3000);

			SeleniumUtils.waitUntilClicked(EditHierarchyPageSelectors.confirmBtn, getDriver());

			Thread.sleep(3000);

			// getWait().until(ExpectedConditions.elementToBeClickable(EditHierarchyPageSelector.confirmBtn));
			// getDriver().findElement(EditHierarchyPageSelector.confirmBtn).click();

		}
		return new ViewHierarchyPage();

	}

	/**
	 * confirmation method to check whether the hierarchy is present under edit page
	 * or not
	 * 
	 * @return
	 */
	public boolean confirmation() {

		try {
			getWait().until(ExpectedConditions.presenceOfElementLocated(EditHierarchyPageSelectors.getHierarchy));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 
	 * selecting the tree and it's version
	 */
	public EditHierarchyPage selectTreeAndVersion() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.selectTree));
		getDriver().findElement(EditHierarchyPageSelectors.selectTree).click();
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.selectVersion));
		getDriver().findElement(EditHierarchyPageSelectors.selectVersion).click();
		return this;
	}

	/**
	 * 
	 * selecting the tree
	 */
	public EditHierarchyPage selectTree() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.selectTree));
		getDriver().findElement(EditHierarchyPageSelectors.selectTree).click();

		return this;

	}

	/**
	 * Adding the node
	 * 
	 */
	public EditHierarchyPage addNode() throws InterruptedException {
		Thread.sleep(5000);
		waitForOverlaysToDisappear(EditHierarchyPageSelectors.overLay);

		getDriver().findElement(EditHierarchyPageSelectors.addNode).click();
		int ran;
		ran = 100 + (int) (Math.random() * ((10000 - 100) + 1));
		getDriver().findElement(EditHierarchyPageSelectors.nodeNameField)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);
		getDriver().findElement(EditHierarchyPageSelectors.originalNameField)
				.sendKeys(ConfigLoader.getTestDataProperty("testData") + ran);

		Select drop = new Select(getDriver().findElement(EditHierarchyPageSelectors.drop));
		drop.selectByVisibleText("Direct");

		getDriver().findElement(EditHierarchyPageSelectors.calendarBtn).click();
		Select dropOne = new Select(getDriver().findElement(EditHierarchyPageSelectors.calendarDrop));
		dropOne.selectByVisibleText("2024");
		getDriver().findElement(EditHierarchyPageSelectors.clickDate).click();

		getDriver().findElement(EditHierarchyPageSelectors.saveBtn).click();

		return this;
	}

	/**
	 * 
	 * Search node functionality
	 */
	public EditHierarchyPage searchNode() throws InterruptedException {
		Thread.sleep(10000);

		getDriver().findElement(EditHierarchyPageSelectors.searchField).sendKeys("Germany", Keys.ENTER);
		return this;
	}

	/**
	 * add version
	 * 
	 * @throws InterruptedException
	 */
	public EditHierarchyPage addVersion() throws InterruptedException {
		Thread.sleep(6000);
		waitForOverlaysToDisappear(EditHierarchyPageSelectors.overLay);
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.versionBtn));
		getDriver().findElement(EditHierarchyPageSelectors.versionBtn).click();

		return this;
	}

	/**
	 * delete version
	 */
	public EditHierarchyPage deleteVersion() {
		try {

			getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.deleteIcon));
			getDriver().findElement(EditHierarchyPageSelectors.deleteIcon).click();
			getDriver().findElement(EditHierarchyPageSelectors.yesIcon).click();
		} catch (Exception e) {
			getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.deleteIconView));
			getDriver().findElement(EditHierarchyPageSelectors.deleteIconView).click();
			getDriver().findElement(EditHierarchyPageSelectors.yesIcon).click();
		}

		return this;
	}

	/**
	 * Coverage navigation
	 * 
	 * @throws InterruptedException
	 */

	public CoverageEditHierarchyPage navigateToCoveragePage() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.nodeLevel4Btn));

		getDriver().findElement(EditHierarchyPageSelectors.nodeLevel4Btn).click();

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.level4Node));

		Thread.sleep(4000);
		getDriver().findElement(EditHierarchyPageSelectors.level4Node).click();

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.leafNode));

		Thread.sleep(4000);
		getDriver().findElement(EditHierarchyPageSelectors.leafNode).click();

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(EditHierarchyPageSelectors.defineCoverageTab));

		getDriver().findElement(EditHierarchyPageSelectors.defineCoverageTab).click();

		Thread.sleep(4000);
		getWait().until(ExpectedConditions.elementToBeClickable(EditHierarchyPageSelectors.addOrEditCoverageBtn));

		getDriver().findElement(EditHierarchyPageSelectors.addOrEditCoverageBtn).click();

		return new CoverageEditHierarchyPage();

	}

	/**
	 * Navigation to Edit pending version page
	 */

	public EditHierarchyPage navigateToEditHierarchyPage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.getHierarchy));
		getDriver().findElement(EditHierarchyPageSelectors.getHierarchy).click();

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.getEditVersion));
		getDriver().findElement(EditHierarchyPageSelectors.getEditVersion).click();
		return this;
	}

	/**
	 * Assertion for search node functionality
	 * 
	 */
	public String checkSearch() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.checkNode));
		return getDriver().findElement(EditHierarchyPageSelectors.checkNode).getText();
	}

	/***
	 * Success message assertion
	 */
	public String successMessage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.successMessage));
		return getDriver().findElement(EditHierarchyPageSelectors.successMessage).getText();
	}

	/**
	 * Assertion for new Version
	 */
	public boolean versionAddCheck() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.newVersionCheck));
		return getDriver().findElement(EditHierarchyPageSelectors.newVersionCheck).isDisplayed();
	}

	/**
	 * Assertion for navigation towards hierarchy edit page
	 */
	public String checkEditHierarchyPage() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.checkEditPage));
		return getDriver().findElement(EditHierarchyPageSelectors.checkEditPage).getText();
	}

	/**
	 * Assertion for pending hierarchy
	 * 
	 * @throws InterruptedException
	 */
	public String checkPendingHierarchy() throws InterruptedException {

		Thread.sleep(5000);
		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.checkPending));
		return getDriver().findElement(EditHierarchyPageSelectors.checkPending).getText();
	}
}
