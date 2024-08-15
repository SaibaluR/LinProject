package hierarchy_test;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import base.Common;
import hierarchy_module_pages.AccountsHierarchyPage;
import hierarchy_module_pages.CockpitHierarchyPage;
import hierarchy_module_pages.CompareHierarchyPage;
import hierarchy_module_pages.CreateHierarchyPage;
import hierarchy_module_pages.EditHierarchyPage;
import hierarchy_module_pages.EmployeeHierarchyPage;
import hierarchy_module_pages.HierarchyHomePage;
import hierarchy_module_pages.MetricHierarchyPage;
import hierarchy_module_pages.PublishPage;
import hierarchy_module_pages.ReportHierarchyPage;
import hierarchy_module_pages.RuleHierarchyPage;
import hierarchy_module_pages.ViewHierarchyPage;
import hierarchy_module_selectors.HierarchyHomePageSelectors;
import landingPage.HomePage;
import landingPage.LoginPage;

public class HierarchyNavigationTest {

	HierarchyHomePage hierHome = new HierarchyHomePage();

	/**
	 * Navigation to View Page
	 */

	@Test(priority = 1)
	public void navigateToHierarchyViewPage() throws InterruptedException {

		LoginPage lp = new LoginPage();
		lp.load().validLogin();

		HomePage hp = new HomePage();
		hp.clickHierarchyBtn();

		ViewHierarchyPage vp = new ViewHierarchyPage();
		Assert.assertEquals(vp.checkViewHierarchyPage(), "View Hierarchy");

	}

	/**
	 * Navigation to Create Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 2)
	public void navigateToHierarchyModuleCreatePage() throws Exception {

		hierHome.clickCreatePage();

		CreateHierarchyPage cp = new CreateHierarchyPage();
		Assert.assertEquals(cp.checkCreateHierarchyPage(), "Create Hierarchy");

	}

	/**
	 * Navigation to Edit Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 3)

	public void navigateToHierarchyModuleEditPage() throws Exception {

		EditHierarchyPage ep = new EditHierarchyPage();

		hierHome.clickEditPage();
		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);
		Assert.assertEquals(ep.checkEditHierarchyPage(), "Edit Hierarchy");

	}

	/**
	 * Navigation to Compare Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 4)
	public void navigateToHierarchyModuleComparePage() throws Exception {

		CompareHierarchyPage comp = new CompareHierarchyPage();
		hierHome.clickComparePage();
		Assert.assertEquals(comp.checkCompareHierarchyPage(), "Compare Hierarchy");
	}

	/**
	 * Navigation to Rule Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 5)
	public void navigateToHierarchyModuleRulePage() throws Exception {

		RuleHierarchyPage rule = new RuleHierarchyPage();
		hierHome.clickRulePage();
		Assert.assertEquals(rule.checkRuleHierarchyPage(), "Rules");
	}

	/**
	 * Navigation to Reports Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 6)
	public void navigateToHierarchyModuleReportPage() throws Exception {

		ReportHierarchyPage rp = new ReportHierarchyPage();
		hierHome.clickReportPage();
		Assert.assertEquals(rp.checkReportHierarchyPage(), "Reports");
	}

	/**
	 * Navigation to Accounts Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 7)
	public void navigateToHierarchyModuleAccountPage() throws Exception {

		AccountsHierarchyPage ap = new AccountsHierarchyPage();
		hierHome.clickAccountsPage();
		Assert.assertEquals(ap.checkAccountsHierarchyPage(), "Accounts");
	}

	/**
	 * Navigation to Cockpit Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 8)
	public void navigateToHierarchyCockpitPage() throws Exception {

		CockpitHierarchyPage cockpitPage = new CockpitHierarchyPage();
		hierHome.clickCockpitPage();
		Assert.assertEquals(cockpitPage.checkCockpitHierarchyPage(), "Cockpit");

	}

	/**
	 * Navigation to employee Page
	 * 
	 * @throws Exception
	 */

	@Test(priority = 9)
	public void navigateToHierarchyEmployeePage() throws Exception {

		EmployeeHierarchyPage employeePage = new EmployeeHierarchyPage();
		hierHome.clickEmployeePage();
		Assert.assertEquals(employeePage.checkEmployeeHierarchyPage(), "Employee");

	}

	@Test(priority = 10)
	public void navigateToHierarchyMetricsPage() throws Exception {

		MetricHierarchyPage metricPage = new MetricHierarchyPage();
		hierHome.clickMetricPage();
		Assert.assertEquals(metricPage.checkMetricsHierarchyPage(), "Metrics");

	}

	@Test(priority = 11)
	public void navigateToHierarchyPublishPage() throws Exception {

		PublishPage publishPage = new PublishPage();
		hierHome.clickPublishPage();
		Assert.assertEquals(publishPage.checkPublishHierarchyPage(), "Publish");

	}

	@AfterClass
	public void quitDriver() throws Exception {
		Common.quitdriver();
	}

	@AfterMethod
	public void ifFailed(ITestResult result) throws IOException, MessagingException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Common.failScreenshotAndSendMail(result);
		}
	}

}
