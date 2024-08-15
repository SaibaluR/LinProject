package hierarchy_module_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Common;
import hierarchy_module_selectors.CoverageViewPageSelectors;

public class CoverageViewHierarchyPage extends Common {

	/**
	 * add the coverage
	 * 
	 * @throws InterruptedException
	 */
	public CoverageViewHierarchyPage addCoverage() throws InterruptedException {

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.addBtn));

		Thread.sleep(6000);
		getDriver().findElement(CoverageViewPageSelectors.addBtn).click();

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.countryDropDwn));
		getDriver().findElement(CoverageViewPageSelectors.countryDropDwn).click();

		Thread.sleep(4000);
		getDriver().findElement(CoverageViewPageSelectors.selectOption).click();

		getDriver().findElement(CoverageViewPageSelectors.outsideClick).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.saveBtn));

		getDriver().findElement(CoverageViewPageSelectors.saveBtn).click();

		return this;

	}

	/**
	 * Setting up of coverage
	 * 
	 * @throws InterruptedException
	 */

	public CoverageViewHierarchyPage setCoverage() throws InterruptedException {

		if (checkCoverageEpression()) // checking if coverage expression is displayed or not
		{
			clearCoverage(); // if displayed, clearing the preset coverage,before adding it
			addCoverage();

		} else {
			addCoverage();
		}
		return this;

	}

	/**
	 * check the coverage expression
	 */
	public boolean checkCoverageEpression() {

		try {
			getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.ruleExp));
			getDriver().findElement(CoverageViewPageSelectors.ruleExp).isDisplayed();
			return true;
		} catch (Exception e) {

			return false;
		}

	}

	/**
	 * Map view navigation
	 */

	public MapHierarchyPage clickMapViewBtn() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.mapBtn));
		getDriver().findElement(CoverageViewPageSelectors.mapBtn).click();

		return new MapHierarchyPage();
	}

	/**
	 * Checking coverage for sort and filters
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public CoverageViewHierarchyPage checkCoverageSetup() throws InterruptedException {

		if (checkCoverageEpression()) {

			return this;

		} else {
			addCoverage();
		}

		return this;
	}

	/**
	 * Remove the existing coverage
	 */
	public CoverageViewHierarchyPage clearCoverage() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.minusBtn));
		getDriver().findElement(CoverageViewPageSelectors.minusBtn).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.saveBtn));
		getDriver().findElement(CoverageViewPageSelectors.saveBtn).click();

		return this;
	}

	/**
	 * sort button click for Account Id column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CoverageViewHierarchyPage clickAccountIdSort() throws InterruptedException {

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountIdSort));

		Thread.sleep(1500);
		getDriver().findElement(CoverageViewPageSelectors.accountIdSort).click();

		return this;
	}

	/**
	 * Account Id Sort functions which returns the true value, if
	 * ascending,descending and default sort is working fine
	 * 
	 * @throws InterruptedException
	 */
	public boolean accountIdSort() throws InterruptedException {

		clickAccountIdSort();

		if (!checkAscendingAccountIdSort()) {
			System.out.println("Ascending sort on Account Id Failed");
			return false;
		}

		clickAccountIdSort();

		if (!checkDescendingAccountIdSort()) {

			System.out.println("Descending sort on Account Id Failed");
			return false;
		}

		clickAccountIdSort();

		if (!checkDefaultAccountIdSort()) {

			System.out.println("Default sort on Account Id Failed");
			return false;
		}
		return true;

	}

	/**
	 * Account Name Sort functions which returns the true value, if
	 * ascending,descending and default sort is working fine
	 * 
	 * @throws InterruptedException
	 */
	public boolean accountNameSort() throws InterruptedException {

		clickAccountNameSort();

		if (!checkAscendingAccountNameSort()) {

			System.out.println("Ascending sort on Account name Failed");
			return false;
		}

		clickAccountNameSort();

		if (!checkDescendingAccountNameSort()) {
			System.out.println("Descending sort on Account name Failed");
			return false;
		}

		clickAccountNameSort();

		if (!checkDefaultAccountNameSort()) {
			System.out.println("Default sort on Account Name Failed");
			return false;
		}
		return true;

	}

	/**
	 * Segment Sort functions which returns the true value, if ascending,descending
	 * and default sort is working fine
	 * 
	 * @throws InterruptedException
	 */
	public boolean segmentSort() throws InterruptedException {

		clickSegmentSort();

		if (!checkAscendingSegmentSort()) {

			System.out.println("Ascending sort on Segment Failed");
			return false;
		}

		clickSegmentSort();

		if (!checkDescendingSegmentSort()) {
			System.out.println("Descending sort on Segment Failed");
			return false;
		}

		clickSegmentSort();

		if (!checkDefaultSegmentSort()) {
			System.out.println("Default sort on Segment Failed");
			return false;
		}
		return true;

	}

	/**
	 * Named Account Sort functions which returns the true value, if
	 * ascending,descending and default sort is working fine
	 * 
	 * @throws InterruptedException
	 */
	public boolean namedAccountSort() throws InterruptedException {

		clickNamedAccountSort();

		if (!checkAscendingNamedAccountSort()) {

			System.out.println("Ascending sort on Segment Failed");
			return false;
		}

		clickNamedAccountSort();

		if (!checkDescendingNamedAccountSort()) {
			System.out.println("Descending sort on Segment Failed");
			return false;
		}

		clickNamedAccountSort();

		if (!checkDefaultNamedAccountSort()) {
			System.out.println("Default sort on Segment Failed");
			return false;
		}
		return true;

	}

	/**
	 * CLick on the Named Account sort
	 * 
	 * @return
	 */

	private CoverageViewHierarchyPage clickNamedAccountSort() {

		scroll(getDriver().findElement(CoverageViewPageSelectors.namedAccountSort));

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.namedAccountSort));

		getDriver().findElement(CoverageViewPageSelectors.namedAccountSort).click();

		return this;

	}

	/**
	 * check Assertion for default sort for Segment column
	 * 
	 * @throws InterruptedException
	 */
	private boolean checkDefaultNamedAccountSort() throws InterruptedException {

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.namedAccountDefaultOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for descending sort for Segment column
	 * 
	 * @throws InterruptedException
	 */
	private boolean checkDescendingNamedAccountSort() throws InterruptedException {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.descendingSort));

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver()
				.findElements(CoverageViewPageSelectors.namedAccountDescendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for Ascending sort for Segment column
	 * 
	 * @throws InterruptedException
	 */
	private boolean checkAscendingNamedAccountSort() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.ascendingSort));

		Thread.sleep(3000);
		
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.namedAccountAscendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for default sort for Segment column
	 * 
	 * @throws InterruptedException
	 */
	private boolean checkDefaultSegmentSort() throws InterruptedException {

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.segmentDefaultCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for descending sort for Segment column
	 * 
	 * @throws InterruptedException
	 */
	private boolean checkDescendingSegmentSort() throws InterruptedException {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.descendingSort));

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.segmentDescendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for Ascending sort for Segment column
	 * 
	 * @throws InterruptedException
	 */
	private boolean checkAscendingSegmentSort() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.ascendingSort));

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.segmentAscendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for Ascending sort for Account id
	 */
	public boolean checkAscendingAccountIdSort() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.ascendingSort));

		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.accountIdAscendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}
	}

	/**
	 * check Assertion for Descending sort for Account id
	 * 
	 * @throws InterruptedException
	 */
	public boolean checkDescendingAccountIdSort() throws InterruptedException {

		Thread.sleep(2000);
		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.descendingSort));

		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.accountIdDescendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}
	}

	/**
	 * sort button click for Account Name column
	 * 
	 * @return
	 */
	public CoverageViewHierarchyPage clickAccountNameSort() {

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountNameSort));

		getDriver().findElement(CoverageViewPageSelectors.accountNameSort).click();

		return this;
	}

	/**
	 * sort button click for Segment column
	 * 
	 * @return
	 */
	public CoverageViewHierarchyPage clickSegmentSort() {

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.segmentSort));

		getDriver().findElement(CoverageViewPageSelectors.segmentSort).click();

		return this;
	}

	/**
	 * Filter for account id column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CoverageViewHierarchyPage accountIdFilter() throws InterruptedException {

		Thread.sleep(4000);

		WebElement horizontalScroll = getDriver().findElement(CoverageViewPageSelectors.horizontalScroll);
		scroll(horizontalScroll);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountIdFilter));

		getDriver().findElement(CoverageViewPageSelectors.accountIdFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountIdFilterOption));

		getDriver().findElement(CoverageViewPageSelectors.accountIdFilterOption).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Account Id Filter clearing
	 */
	public CoverageViewHierarchyPage clearAccountIdFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountIdFilter));

		getDriver().findElement(CoverageViewPageSelectors.accountIdFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.clearBtn));

		getDriver().findElement(CoverageViewPageSelectors.clearBtn).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Filter for account name column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CoverageViewHierarchyPage accountNameFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountNameFilter));

		getDriver().findElement(CoverageViewPageSelectors.accountNameFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountNameFilterOption));

		getDriver().findElement(CoverageViewPageSelectors.accountNameFilterOption).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Account name Filter clearing
	 */
	public CoverageViewHierarchyPage clearAccountNameFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.accountNameFilter));

		getDriver().findElement(CoverageViewPageSelectors.accountNameFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.clearBtn));

		getDriver().findElement(CoverageViewPageSelectors.clearBtn).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Filter for Segment column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CoverageViewHierarchyPage segmentFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.segmentFilter));

		getDriver().findElement(CoverageViewPageSelectors.segmentFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.segmentFilterOption));

		getDriver().findElement(CoverageViewPageSelectors.segmentFilterOption).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Segment Filter clearing
	 */
	public CoverageViewHierarchyPage clearSegmentFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.segmentFilter));

		getDriver().findElement(CoverageViewPageSelectors.segmentFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.clearBtn));

		getDriver().findElement(CoverageViewPageSelectors.clearBtn).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Assertion for Segment filter
	 */
	public String checkSegmentFilter() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.segmentFilterCheck));

		return getDriver().findElement(CoverageViewPageSelectors.segmentFilterCheck).getText();
	}

	/**
	 * Filter for Postal code
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public CoverageViewHierarchyPage postalCodeFilter() throws InterruptedException {

		WebElement scroll = getDriver().findElement(CoverageViewPageSelectors.scroll);
		scroll(scroll);

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.postalFilter));

		getDriver().findElement(CoverageViewPageSelectors.postalFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.postalFilterOption));

		getDriver().findElement(CoverageViewPageSelectors.postalFilterOption).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Postal Code Filter clearing
	 */
	public CoverageViewHierarchyPage clearPostalFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.postalFilter));

		getDriver().findElement(CoverageViewPageSelectors.postalFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(CoverageViewPageSelectors.clearBtn));

		getDriver().findElement(CoverageViewPageSelectors.clearBtn).click();

		getDriver().findElement(CoverageViewPageSelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Assertion for Postal filter
	 */
	public String checkPostalFilter() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.postalFilterCheck));

		return getDriver().findElement(CoverageViewPageSelectors.postalFilterCheck).getText();
	}

	/**
	 * Assertion for Account id filter
	 */
	public String checkAccountIdFilter() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.accountIdFilterCheck));

		return getDriver().findElement(CoverageViewPageSelectors.accountIdFilterCheck).getText();
	}

	/**
	 * Assertion for Account name filter
	 */
	public String checkAccountNameFilter() {

		getWait()
				.until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.accountNameFilterCheck));

		return getDriver().findElement(CoverageViewPageSelectors.accountNameFilterCheck).getText();
	}

	/**
	 * check Assertion for default sort for Account id
	 * 
	 * @throws InterruptedException
	 */
	public boolean checkDefaultAccountIdSort() throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.accountIdDefaultCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for Ascending sort for Account id
	 * 
	 * @throws InterruptedException
	 */
	public boolean checkAscendingAccountNameSort() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.ascendingSort));

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.accountNameAscendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}
	}

	/**
	 * check Assertion for Descending sort for Account id
	 * 
	 * @throws InterruptedException
	 */
	public boolean checkDescendingAccountNameSort() throws InterruptedException {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.descendingSort));

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.accountNameDescendingOrderCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * check Assertion for default sort for Account id
	 * 
	 * @throws InterruptedException
	 */
	public boolean checkDefaultAccountNameSort() throws InterruptedException {

		Thread.sleep(3000);
		// taking all the elements in a list, and searching the first element is
		// displayed or not, if displayed returns true or else false
		List<WebElement> elements = getDriver().findElements(CoverageViewPageSelectors.accountNameDefaultCheck);

		if (elements.size() > 0) {
			return elements.get(0).isDisplayed();
		} else {
			return false;
		}

	}

	/**
	 * Assertion for setting up of coverage
	 */
	public String checkCoverageUpdation() {
		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(CoverageViewPageSelectors.checkSaveCoverageMessage));

		return getDriver().findElement(CoverageViewPageSelectors.checkSaveCoverageMessage).getText();
	}

}
