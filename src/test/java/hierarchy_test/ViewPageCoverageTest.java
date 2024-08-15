package hierarchy_test;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Common;
import hierarchy_module_pages.CoverageViewHierarchyPage;
import hierarchy_module_pages.MapHierarchyPage;
import hierarchy_module_pages.ViewHierarchyPage;
import landingPage.HomePage;
import landingPage.LoginPage;
import utils.DeletefolderUtils;

public class ViewPageCoverageTest {

	CoverageViewHierarchyPage cp = new CoverageViewHierarchyPage();
	MapHierarchyPage mp = new MapHierarchyPage();
	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void navigateToHierachyConfirmedCoveragePage() throws Exception {

		LoginPage lp = new LoginPage();
		lp.load().validLogin();

		HomePage hp = new HomePage();
		hp.clickHierarchyBtn();

		ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.navigateToViewConfirmed();
		Assert.assertEquals(vp.checkConfirmedHierarchy(), "CONFIRMED");

		vp.navigateToCoveragePage();

		// Assert.assertTrue(vp.checkLeafNode());

	}

	@Test(priority = 2, invocationCount = 2)
	public void settingUpAndRemovingOfCoverage() throws InterruptedException {

		cp.setCoverage();

		Assert.assertEquals(cp.checkCoverageUpdation(), "Node Coverage updated Successfully");
	}

	@Test(priority = 3)
	public void sortFunction() throws InterruptedException {

		cp.checkCoverageSetup();

		softAssert.assertEquals(cp.accountIdSort(), true);

		softAssert.assertEquals(cp.accountNameSort(), true);

		softAssert.assertEquals(cp.segmentSort(), true);

		softAssert.assertEquals(cp.namedAccountSort(), true);

		softAssert.assertAll();

	}

	@Test(priority = 4)
	public void filterFunction() throws InterruptedException {

		cp.checkCoverageSetup();

		cp.accountIdFilter();

		softAssert.assertEquals(cp.checkAccountIdFilter(), "0010z00001b5UogAAE");

		cp.clearAccountIdFilter();

		cp.accountNameFilter();

		softAssert.assertEquals(cp.checkAccountNameFilter(), "Alexandria Real Estate Equities, Inc.");

		cp.clearAccountNameFilter();

		cp.segmentFilter();

		softAssert.assertEquals(cp.checkSegmentFilter(), "Majors");

		cp.clearSegmentFilter();

		cp.postalCodeFilter();

		softAssert.assertEquals(cp.checkPostalFilter(), "02881-1974");

		cp.clearPostalFilter();

		softAssert.assertAll();

	}

	@Test(priority = 5)
	public void sortFunctionMapPage() throws InterruptedException {

		cp.checkCoverageSetup();

		cp.clickMapViewBtn();

		softAssert.assertEquals(mp.checkMapPageNavigation(), "Map");

		mp.clickAccountIdSort();

		softAssert.assertEquals(mp.checkAscendingAccountIdSort(), "0010z00001b51SQAAY");

		mp.clickAccountIdSort();

		softAssert.assertEquals(mp.checkDescendingAccountIdSort(), "0016000000p6wLWAAY");

		mp.clickAccountIdSort();

		softAssert.assertEquals(mp.checkDefaultAccountIdSort(), "0010z00001S55EaAAJ");

		mp.clickAccountNameSort();

		softAssert.assertEquals(mp.checkAscendingAccountNameSort(), "Acme Tools Bemidji");

		mp.clickAccountNameSort();

		softAssert.assertEquals(mp.checkDescendingAccountNameSort(), "Zwift, Inc.");

		mp.clickAccountNameSort();

		softAssert.assertEquals(mp.checkDefaultAccountNameSort(), "Cybergrx, Inc.");

		softAssert.assertAll();
	}

	@Test(priority = 6)
	public void filterMapFunction() throws InterruptedException {

		cp.checkCoverageSetup();

		cp.accountIdFilter();

		softAssert.assertEquals(cp.checkAccountIdFilter(), "0010z00001b5UogAAE");

		cp.clearAccountIdFilter();

		cp.accountNameFilter();

		softAssert.assertEquals(cp.checkAccountNameFilter(), "Alexandria Real Estate Equities, Inc.");

		cp.clearAccountNameFilter();

		cp.segmentFilter();

		softAssert.assertEquals(cp.checkSegmentFilter(), "Majors");

		cp.clearSegmentFilter();

		cp.postalCodeFilter();

		softAssert.assertEquals(cp.checkPostalFilter(), "02881-1974");

		cp.clearPostalFilter();

		softAssert.assertAll();

	}

	/*
	 * @AfterClass public void quitDriver() throws Exception {
	 * 
	 * DeletefolderUtils.cleanup(); Common.quitdriver(); }
	 * 
	 * @AfterMethod public void ifFailed(ITestResult result) throws IOException,
	 * MessagingException { if (result.getStatus() == ITestResult.FAILURE) {
	 * Common.failScreenshotAndSendMail(result); } }
	 */

}
