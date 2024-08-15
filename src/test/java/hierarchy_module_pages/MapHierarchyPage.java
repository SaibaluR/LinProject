package hierarchy_module_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Common;
import hierarchy_module_selectors.MapHierarchySelectors;

public class MapHierarchyPage extends Common {

	/**
	 * Assertion for Map page
	 */
	public String checkMapPageNavigation() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.mapCheck));

		return getDriver().findElement(MapHierarchySelectors.mapCheck).getText();
	}

	
	/**
	 * sort button click for Account Id column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public MapHierarchyPage clickAccountIdSort() throws InterruptedException {

		
		
		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountIdSort));

		Thread.sleep(4000);
		getDriver().findElement(MapHierarchySelectors.accountIdSort).click();

		return this;
	}

	/**
	 * check Assertion for Ascending sort for Account id
	 */
	public String checkAscendingAccountIdSort() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.ascendingSort));
		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountIdAscendingOrderCheck));

		return getDriver().findElement(MapHierarchySelectors.accountIdAscendingOrderCheck).getText();
	}

	/**
	 * check Assertion for Descending sort for Account id
	 * 
	 * @throws InterruptedException
	 */
	public String checkDescendingAccountIdSort() throws InterruptedException {

		Thread.sleep(2000);
		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.descendingSort));
		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountIdDescendingOrderCheck));

		return getDriver().findElement(MapHierarchySelectors.accountIdDescendingOrderCheck).getText();
	}

	/**
	 * sort button click for Account Name column
	 * 
	 * @return
	 */
	public MapHierarchyPage clickAccountNameSort() {

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountNameSort));

		getDriver().findElement(MapHierarchySelectors.accountNameSort).click();

		return this;
	}

	/**
	 * Filter for account id column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public MapHierarchyPage accountIdFilter() throws InterruptedException {

		Thread.sleep(4000);

		WebElement horizontalScroll = getDriver().findElement(MapHierarchySelectors.horizontalScroll);
		scroll(horizontalScroll);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountIdFilter));

		getDriver().findElement(MapHierarchySelectors.accountIdFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountIdFilterOption));

		getDriver().findElement(MapHierarchySelectors.accountIdFilterOption).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Account Id Filter clearing
	 */
	public MapHierarchyPage clearAccountIdFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountIdFilter));

		getDriver().findElement(MapHierarchySelectors.accountIdFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.clearBtn));

		getDriver().findElement(MapHierarchySelectors.clearBtn).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Filter for account name column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public MapHierarchyPage accountNameFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountNameFilter));

		getDriver().findElement(MapHierarchySelectors.accountNameFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountNameFilterOption));

		getDriver().findElement(MapHierarchySelectors.accountNameFilterOption).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Account name Filter clearing
	 */
	public MapHierarchyPage clearAccountNameFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.accountNameFilter));

		getDriver().findElement(MapHierarchySelectors.accountNameFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.clearBtn));

		getDriver().findElement(MapHierarchySelectors.clearBtn).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Filter for Segment column
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public MapHierarchyPage segmentFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.segmentFilter));

		getDriver().findElement(MapHierarchySelectors.segmentFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.segmentFilterOption));

		getDriver().findElement(MapHierarchySelectors.segmentFilterOption).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Segment Filter clearing
	 */
	public MapHierarchyPage clearSegmentFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.segmentFilter));

		getDriver().findElement(MapHierarchySelectors.segmentFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.clearBtn));

		getDriver().findElement(MapHierarchySelectors.clearBtn).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Assertion for Segment filter
	 */
	public String checkSegmentFilter() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.segmentFilterCheck));

		return getDriver().findElement(MapHierarchySelectors.segmentFilterCheck).getText();
	}

	/**
	 * Filter for Postal code
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public MapHierarchyPage postalCodeFilter() throws InterruptedException {

		WebElement scroll = getDriver().findElement(MapHierarchySelectors.scroll);
		scroll(scroll);

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.postalFilter));

		getDriver().findElement(MapHierarchySelectors.postalFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.postalFilterOption));

		getDriver().findElement(MapHierarchySelectors.postalFilterOption).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Postal Code Filter clearing
	 */
	public MapHierarchyPage clearPostalFilter() throws InterruptedException {

		Thread.sleep(4000);

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.postalFilter));

		getDriver().findElement(MapHierarchySelectors.postalFilter).click();

		getWait().until(ExpectedConditions.elementToBeClickable(MapHierarchySelectors.clearBtn));

		getDriver().findElement(MapHierarchySelectors.clearBtn).click();

		getDriver().findElement(MapHierarchySelectors.filterOkBtn).click();

		return this;
	}

	/**
	 * Assertion for Postal filter
	 */
	public String checkPostalFilter() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.postalFilterCheck));

		return getDriver().findElement(MapHierarchySelectors.postalFilterCheck).getText();
	}

	/**
	 * Assertion for Account id filter
	 */
	public String checkAccountIdFilter() {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountIdFilterCheck));

		return getDriver().findElement(MapHierarchySelectors.accountIdFilterCheck).getText();
	}

	/**
	 * Assertion for Account name filter
	 */
	public String checkAccountNameFilter() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountNameFilterCheck));

		return getDriver().findElement(MapHierarchySelectors.accountNameFilterCheck).getText();
	}

	/**
	 * check Assertion for default sort for Account id
	 */
	public String checkDefaultAccountIdSort() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountIdDefaultCheck));

		return getDriver().findElement(MapHierarchySelectors.accountIdDefaultCheck).getText();
	}

	/**
	 * check Assertion for Ascending sort for Account id
	 */
	public String checkAscendingAccountNameSort() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.ascendingSort));
		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountNameAscendingOrderCheck));

		return getDriver().findElement(MapHierarchySelectors.accountNameAscendingOrderCheck).getText();
	}

	/**
	 * check Assertion for Descending sort for Account id
	 */
	public String checkDescendingAccountNameSort() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.descendingSort));
		getWait().until(
				ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountNameDescendingOrderCheck));

		return getDriver().findElement(MapHierarchySelectors.accountNameDescendingOrderCheck).getText();
	}

	/**
	 * check Assertion for default sort for Account id
	 */
	public String checkDefaultAccountNameSort() {

		getWait().until(ExpectedConditions.visibilityOfElementLocated(MapHierarchySelectors.accountNameDefaultCheck));

		return getDriver().findElement(MapHierarchySelectors.accountNameDefaultCheck).getText();
	}

	
}
