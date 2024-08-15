package hierarchy_module_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import base.Common;
import hierarchy_module_selectors.EditHierarchyPageSelectors;
import hierarchy_module_selectors.ViewHierarchyPageSelectors;
import utils.SeleniumUtils;

public class ViewHierarchyPage extends Common {

	/**
	 * Assertion for navigation towards hierarchy view page
	 */
	public String checkViewHierarchyPage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkViewPage));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkViewPage).getText();
	}

	/**
	 * Navigation to confirmed Hierarchy
	 * 
	 * @return
	 * @throws Exception
	 */
	public ViewHierarchyPage navigateToViewConfirmed() throws Exception {

		Thread.sleep(10000);

		// System.out.println(getDriver().findElement(ViewHierarchyPageSelectors.getHierarchy).isDisplayed());

		if (confirmation() == false) {

			HierarchyHomePage hp = new HierarchyHomePage();
			hp.clickEditPage();

			EditHierarchyPage ep = new EditHierarchyPage();
			ep.moveToConfirm();

		} else {

			getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.getHierarchy));
			getDriver().findElement(ViewHierarchyPageSelectors.getHierarchy).click();

			getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.getVersion));
			getDriver().findElement(ViewHierarchyPageSelectors.getVersion).click();
		}

		return this;
	}

	/**
	 * confirmation method to check whether the hierarchy is present under view page
	 * or not
	 * 
	 * @return
	 */
	public boolean confirmation() {

		try {

			getWait().until(ExpectedConditions.presenceOfElementLocated(ViewHierarchyPageSelectors.getHierarchy));
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	/**
	 * Maximize function
	 * 
	 * @return
	 * @throws Exception
	 */
	public ViewHierarchyPage maximize() throws Exception {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.maxBtn));
		SeleniumUtils.waitUntilClicked(ViewHierarchyPageSelectors.maxBtn, getDriver());
		// getDriver().findElement(ViewHierarchyPageSelectors.maxBtn).click();

		return this;
	}

	/**
	 * Zoom in function
	 */
	public ViewHierarchyPage clickZoomInBtn() {

		getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ViewHierarchyPageSelectors.zoomInBtn));

		Actions actions = new Actions(getDriver());

		WebElement btn = getDriver().findElement(ViewHierarchyPageSelectors.zoomInBtn);

		actions.doubleClick(btn).perform();

		return this;
	}

	/**
	 * Zoom out function
	 */
	public ViewHierarchyPage clickZoomOutBtn() {

		getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ViewHierarchyPageSelectors.zoomOutBtn));

		if (getDriver().findElement(ViewHierarchyPageSelectors.checkZoomIn).isDisplayed()) {

			Actions actions = new Actions(getDriver());

			WebElement btn = getDriver().findElement(ViewHierarchyPageSelectors.zoomOutBtn);

			actions.doubleClick(btn).perform();
		}
		return this;
	}

	/**
	 * Assertion for zoom in function
	 * 
	 * @return
	 */
	public String checkZoomIn() {

		getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ViewHierarchyPageSelectors.checkZoomIn));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkZoomIn).getText();
	}

	/**
	 * Assertion for zoom out function
	 * 
	 * @return
	 */
	public String checkZoomOut() {

		return getDriver().findElement(ViewHierarchyPageSelectors.checkZoomOut).getText();
	}

	/**
	 * Assertion for Maximize function
	 * 
	 * @return
	 */
	public boolean checkMaximize() {

		getDriver().findElement(ViewHierarchyPageSelectors.checkMax).isDisplayed();

		return true;
	}

	/**
	 * Minimize function
	 * 
	 * @return
	 * @throws Exception
	 */
	public ViewHierarchyPage minimize() throws Exception {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.minBtn));
		SeleniumUtils.waitUntilClicked(ViewHierarchyPageSelectors.minBtn, getDriver());
		// getDriver().findElement(ViewHierarchyPageSelectors.minBtn).click();

		return this;
	}

	/**
	 * Download functionality
	 * 
	 * @throws InterruptedException
	 */
	public ViewHierarchyPage downloadfile() throws InterruptedException {
		// Thread.sleep(5000);
		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.downloadBtn));
		getDriver().findElement(ViewHierarchyPageSelectors.downloadBtn).click();
		Thread.sleep(5000);

		return this;
	}

	/**
	 * Move to edit functionality
	 * 
	 * @throws Exception
	 */
	public EditHierarchyPage moveToEdit() throws Exception {

		getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ViewHierarchyPageSelectors.moveToEditBtn));
		SeleniumUtils.waitUntilClicked(ViewHierarchyPageSelectors.moveToEditBtn, getDriver());

		getDriver().findElement(ViewHierarchyPageSelectors.moveToEditBtn).click();

		getWait().until(ExpectedConditions.visibilityOfElementLocated(EditHierarchyPageSelectors.checkPending));

		return new EditHierarchyPage();
	}

	/**
	 * Search by Node with valid scenario
	 */
	public ViewHierarchyPage searchByNode() {

		if (driver.findElement(ViewHierarchyPageSelectors.searchEmployeeBox).isDisplayed()) {

			WebElement element = getDriver().findElement(ViewHierarchyPageSelectors.dropDown);

			Select select = new Select(element);

			select.selectByIndex(0);
			getDriver().findElement(ViewHierarchyPageSelectors.searchNodeBox).sendKeys("Hyderabad", Keys.ENTER);

		} else {
			getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.searchNodeBox));

			getDriver().findElement(ViewHierarchyPageSelectors.searchNodeBox).sendKeys("Hyderabad", Keys.ENTER);
		}

		return this;
	}

	/**
	 * Search by Node with negative scenario
	 */
	public ViewHierarchyPage searchByNodeInvalid() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.searchNodeBox));

		getDriver().findElement(ViewHierarchyPageSelectors.searchNodeBox).sendKeys("Latest Tst", Keys.ENTER);
		return this;
	}

	/**
	 * Search by Employee with valid scenario
	 * 
	 * @throws Exception
	 */
	public ViewHierarchyPage searchByEmployee() throws Exception {

		getWait().until(ExpectedConditions.elementToBeClickable(ViewHierarchyPageSelectors.searchNodeBox));

		scroll(getDriver().findElement(ViewHierarchyPageSelectors.dropDown));

		WebElement element = getDriver().findElement(ViewHierarchyPageSelectors.dropDown);

		Select select = new Select(element);

		select.selectByIndex(1);

		getDriver().findElement(ViewHierarchyPageSelectors.searchEmployeeBox).sendKeys("Kevin Scott", Keys.ENTER);
		return this;
	}

	/**
	 * Search by Employee with invalid scenario
	 * 
	 * @throws Exception
	 */
	public ViewHierarchyPage searchByInvalidEmployee() throws Exception {

		getWait().until(ExpectedConditions.elementToBeClickable(ViewHierarchyPageSelectors.searchEmployeeBox));

		if (driver.findElement(ViewHierarchyPageSelectors.searchEmployeeBox).isDisplayed()) {

			getDriver().findElement(ViewHierarchyPageSelectors.searchEmployeeBox).sendKeys("xyz", Keys.ENTER);
		} else {

			WebElement element = getDriver().findElement(ViewHierarchyPageSelectors.dropDown);

			Select select = new Select(element);

			select.selectByIndex(1);
			getDriver().findElement(ViewHierarchyPageSelectors.searchEmployeeBox).sendKeys("xyz", Keys.ENTER);
		}

		return this;
	}

	/**
	 * Search by employee with negative scenario
	 */
	public ViewHierarchyPage searchByEmployeeInvalid() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.searchNodeBox));

		getDriver().findElement(ViewHierarchyPageSelectors.searchEmployeeBox).sendKeys("Latest Tst", Keys.ENTER);
		return this;
	}

	/**
	 * clear button functionality for Node searchbox
	 * 
	 * @throws InterruptedException
	 */
	public ViewHierarchyPage clearBtn() throws InterruptedException {

		getWait().until(ExpectedConditions.elementToBeClickable(ViewHierarchyPageSelectors.clearBtn));

		boolean click = true;
		try {
			getDriver().findElement(ViewHierarchyPageSelectors.clearBtn).click();
		} catch (Exception e) {
			click = false;
		}
		if (!click) {
			getDriver().findElement(ViewHierarchyPageSelectors.searchNodeBox).clear();
		}
		return this;
	}

	/**
	 * clear button functionality for Employee searchbox
	 */
	public ViewHierarchyPage clearBtnEmployeeNodebox() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.searchEmployeeBox));
		boolean click = true;
		try {
			getDriver().findElement(ViewHierarchyPageSelectors.clearBtnEmployee).click();
		} catch (Exception e) {
			click = false;
		}
		if (!click) {
			getDriver().findElement(ViewHierarchyPageSelectors.searchEmployeeBox).clear();
		}

		return this;
	}

	/**
	 * Coverage navigation
	 * 
	 * @throws InterruptedException
	 */

	public CoverageViewHierarchyPage navigateToCoveragePage() throws InterruptedException {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.nodeLevel4Btn));

		getDriver().findElement(ViewHierarchyPageSelectors.nodeLevel4Btn).click();

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.level4Node));

		Thread.sleep(4000);
		getDriver().findElement(ViewHierarchyPageSelectors.level4Node).click();

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.leafNode));

		Thread.sleep(4000);
		getDriver().findElement(ViewHierarchyPageSelectors.leafNode).click();

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(ViewHierarchyPageSelectors.viewCoverageTab));

		getDriver().findElement(ViewHierarchyPageSelectors.viewCoverageTab).click();

		Thread.sleep(4000);
		getWait().until(ExpectedConditions.elementToBeClickable(ViewHierarchyPageSelectors.addOrEditCoverageBtn));

		getDriver().findElement(ViewHierarchyPageSelectors.addOrEditCoverageBtn).click();

		return new CoverageViewHierarchyPage();

	}

	/**
	 * Assertion for leaf node selection
	 * 
	 * @throws InterruptedException
	 */
	public boolean checkLeafNode() throws InterruptedException {
		Thread.sleep(4000);

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkNodeSelection));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkNodeSelection).isEnabled();
	}

	/**
	 * Assertion for invalid search node
	 */
	public String checkSearchByNodeInvalid() {

		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkSearchNodeInvalid));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkSearchNodeInvalid).getText();
	}

	/**
	 * Assertion for searched node
	 */
	public boolean checkSearchByNode() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkSearchNode));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkSearchNode).isEnabled();
	}

	/**
	 * Assertion for searched valid employee
	 */
	public String checkSearchByValidEmployee() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkValidEmployee));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkValidEmployee).getText();
	}

	/**
	 * Assertion for searched invalid employee
	 */
	public String checkSearchByInValidEmployee() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkInvalidEmployee));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkInvalidEmployee).getText();
	}

	/**
	 * Assertion for Minimize function
	 * 
	 * @return
	 */
	public boolean checkMinimize() {

		getDriver().findElement(ViewHierarchyPageSelectors.checkMin).isDisplayed();

		return true;
	}

	/**
	 * Assertion for Confirmed Hierarchy
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public String checkConfirmedHierarchy() throws InterruptedException {

		Thread.sleep(5000);
		waitForOverlaysToDisappear(ViewHierarchyPageSelectors.overLay);

		getWait().until(ExpectedConditions
				.visibilityOfElementLocated(ViewHierarchyPageSelectors.checkConfirmHierarchyFromView));

		return getDriver().findElement(ViewHierarchyPageSelectors.checkConfirmHierarchyFromView).getText();
	}
}
