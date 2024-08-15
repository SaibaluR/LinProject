package hierarchy_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import hierarchy_module_pages.CoverageEditHierarchyPage;
import hierarchy_module_pages.EditHierarchyPage;
import hierarchy_module_pages.HierarchyHomePage;
import hierarchy_module_selectors.HierarchyHomePageSelectors;
import landingPage.HomePage;
import landingPage.LoginPage;

public class EditPageCoverageTest {
	EditHierarchyPage ep = new EditHierarchyPage();
	CoverageEditHierarchyPage cp = new CoverageEditHierarchyPage();

	@Test(priority = 1)
	public void navigateToHierachyPendingPage() throws Exception {

		LoginPage lp = new LoginPage();
		lp.load().validLogin();

		HomePage hp = new HomePage();
		hp.clickHierarchyBtn();

		HierarchyHomePage hierHome = new HierarchyHomePage();
		hierHome.clickEditPage();

		Common.waitForOverlaysToDisappear(HierarchyHomePageSelectors.overLay);
		Assert.assertEquals(ep.checkEditHierarchyPage(), "Edit Hierarchy");

		ep.navigateToEditHierarchyPage();

		Assert.assertEquals(ep.checkPendingHierarchy(), "PENDING");

		ep.navigateToCoveragePage();

		// Assert.assertTrue(vp.checkLeafNode());

	}

	@Test(priority = 2, invocationCount = 2)
	public void settingUpAndRemovingOfCoverage() throws InterruptedException {

		cp.setCoverage();

		Assert.assertEquals(cp.checkCoverageUpdation(), "Node Coverage updated Successfully");
	}
}
