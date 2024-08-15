package hierarchy_module_pages;

import base.Common;
import hierarchy_module_selectors.HierarchyHomePageSelectors;
import utils.SeleniumUtils;

public class HierarchyHomePage extends Common {

	/*
	 * public HierarchyHomePage(WebDriver driver) { this.driver = driver; this.wait
	 * = new WebDriverWait(driver, 40); PageFactory.initElements(driver, this); }
	 */

	/**
	 * click edit option
	 * 
	 * @throws Exception
	 */
	public EditHierarchyPage clickEditPage() throws Exception {

		Thread.sleep(5000);

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.editBtn, getDriver());
		return new EditHierarchyPage();
	}

	/**
	 * click Create option
	 * 
	 * @throws Exception
	 */
	public CreateHierarchyPage clickCreatePage() throws Exception {

		Thread.sleep(15000);

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.createBtn, getDriver());

		return new CreateHierarchyPage();
	}

	/**
	 * click Compare option
	 * 
	 * @throws Exception
	 */
	public CompareHierarchyPage clickComparePage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.compareBtn, getDriver());

		return new CompareHierarchyPage();
	}

	/**
	 * click Reports option
	 * 
	 * @throws Exception
	 */
	public ReportHierarchyPage clickReportPage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.reportBtn, getDriver());

		return new ReportHierarchyPage();
	}

	/**
	 * click Accounts option
	 * 
	 * @throws Exception
	 */
	public AccountsHierarchyPage clickAccountsPage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.accountsBtn, getDriver());

		return new AccountsHierarchyPage();
	}

	/**
	 * click Rule option
	 * 
	 * @throws Exception
	 */
	public RuleHierarchyPage clickRulePage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.ruleBtn, getDriver());

		return new RuleHierarchyPage();
	}

	/**
	 * click Reports option
	 * 
	 * @throws Exception
	 */
	public CockpitHierarchyPage clickCockpitPage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.cockpitBtn, getDriver());

		return new CockpitHierarchyPage();
	}

	/**
	 * Click Employee option
	 * 
	 * @throws Exception
	 */
	public EmployeeHierarchyPage clickEmployeePage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.employeeBtn, getDriver());

		return new EmployeeHierarchyPage();
	}

	/**
	 * Click Metrics option
	 * 
	 * @throws Exception
	 */
	public MetricHierarchyPage clickMetricPage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.metricsBtn, getDriver());

		return new MetricHierarchyPage();
	}

	/**
	 * Click Publish option
	 * 
	 * @throws Exception
	 */
	public MetricHierarchyPage clickPublishPage() throws Exception {

		waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);

		SeleniumUtils.waitUntilClicked(HierarchyHomePageSelectors.publishBtn, getDriver());

		return new MetricHierarchyPage();
	}

}
