package hierarchy_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.Common;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.Assert;
import org.testng.ITestResult;

import hierarchy_module_pages.EditHierarchyPage;
import hierarchy_module_pages.ViewHierarchyPage;
import landingPage.HomePage;
import landingPage.LoginPage;
import utils.DeletefolderUtils;
import utils.DownloadUtils;

public class ViewPageTest {

	ViewHierarchyPage vp = new ViewHierarchyPage();

	@Test(priority = 1)
	public void navigateToHierachyConfirmedPage() throws Exception {

		LoginPage lp = new LoginPage();
		lp.load().validLogin();

		HomePage hp = new HomePage();
		hp.clickHierarchyBtn();

		// ViewHierarchyPage vp = new ViewHierarchyPage();
		vp.navigateToViewConfirmed();
		Assert.assertEquals(vp.checkConfirmedHierarchy(), "CONFIRMED");

	}

	/*
	 * @Test(priority = 2)
	 * 
	 * public void coverageNavigation() {
	 * 
	 * vp.navigateToCoveragePage(); }
	 */

	@Test(priority = 2)
	public void maximizeAndMinimize() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.maximize();
		Assert.assertTrue(vp.checkMaximize());

		vp.minimize();
		Assert.assertTrue(vp.checkMinimize());

	}

	@Test(priority = 3)
	public void downloadFileTest() throws Exception {

		vp.downloadfile();

		Assert.assertTrue(DownloadUtils.downloadFile("Automation_hierarchy_View Page Test Version.csv"));

	}

	@Test(priority = 4)
	public void zoomInAndZoomOut() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clickZoomInBtn();
		Assert.assertEquals(vp.checkZoomIn(), "100 %");

		vp.clickZoomOutBtn();
		Assert.assertEquals(vp.checkZoomOut(), "0 %");

	}

	@Test(priority = 5)
	public void searchByNode() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.searchByNode();
		Assert.assertTrue(vp.checkSearchByNode());
	}

	@Test(priority = 6)
	public void searchByNodeInvalid() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clearBtn().searchByNodeInvalid();

		Assert.assertEquals(vp.checkSearchByNodeInvalid(), "Latest Tst node not found");
	}

	@Test(priority = 7)
	public void searchByEmployee() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clearBtn().searchByEmployee();

		Assert.assertEquals(vp.checkSearchByValidEmployee(), "Kevin Scott employee found");
	}

	@Test(priority = 8)
	public void searchByInvalidEmployee() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clearBtnEmployeeNodebox().searchByInvalidEmployee();

		Assert.assertEquals(vp.checkSearchByInValidEmployee(), "xyz employee not found");
	}

	@Test(priority = 9)
	public void searchByNodeAfterMax() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.maximize().clearBtnEmployeeNodebox().searchByNode();

		Assert.assertTrue(vp.checkSearchByNode());
	}

	@Test(priority = 10)
	public void searchByInvalidNodeAfterMax() throws Exception {

		ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clearBtn().searchByNodeInvalid();

		Assert.assertEquals(vp.checkSearchByNodeInvalid(), "Latest Tst node not found");
	}

	@Test(priority = 11)
	public void searchByEmployeeAfterMax() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clearBtn().searchByEmployee();

		Assert.assertEquals(vp.checkSearchByValidEmployee(), "Kevin Scott employee found");
	}

	@Test(priority = 12)
	public void searchByInvalidEmployeeAfterMax() throws Exception {

		// ViewHierarchyPage vp = new ViewHierarchyPage();

		vp.clearBtnEmployeeNodebox().searchByInvalidEmployee();

		Assert.assertEquals(vp.checkSearchByInValidEmployee(), "xyz employee not found");
	}

	@Test(priority = 13)
	public void zoomInZoomOutEmployeeAfterMax() throws Exception {

		vp.clickZoomInBtn();
		Assert.assertEquals(vp.checkZoomIn(), "100 %");

		vp.clickZoomOutBtn();
		Assert.assertEquals(vp.checkZoomOut(), "0 %");
	}

	@Test(priority = 14)
	public void downloadFileAfterMax() throws Exception {

		vp.downloadfile();

		Assert.assertTrue(DownloadUtils.downloadFile("Automation_hierarchy_View Page Test Version (1).csv"));
	}

	@Test(priority = 15)
	public void moveToEditAfterMax() throws Exception {

		vp.moveToEdit();
		EditHierarchyPage ep = new EditHierarchyPage();
		Assert.assertEquals(ep.checkPendingHierarchy(), "PENDING");

	}

	@AfterClass
	public void quitDriver() throws Exception {

		DeletefolderUtils.cleanup();
		Common.quitdriver();
	}

	@AfterMethod
	public void ifFailed(ITestResult result) throws IOException, MessagingException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Common.failScreenshotAndSendMail(result);
		}
	}

}
