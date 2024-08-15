package hierarchy_test;

import java.io.IOException;

import javax.mail.MessagingException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.Common;
import hierarchy_module_pages.CreateHierarchyPage;
import hierarchy_module_pages.HierarchyHomePage;
import landingPage.HomePage;
import landingPage.LoginPage;
import utils.DeletefolderUtils;

public class CreateTest {

	@Test(priority = 1)
	public void validUpload() throws Exception {

		LoginPage lp = new LoginPage();
		lp.load().validLogin();

		HomePage hp = new HomePage();
		hp.clickHierarchyBtn();

		HierarchyHomePage hierHome = new HierarchyHomePage();

		hierHome.clickCreatePage();

		CreateHierarchyPage cp = new CreateHierarchyPage();
		cp.createNewHierarchyWithValidFile();

		Assert.assertEquals(cp.checkValidUpload(),
				"Congratulations! You have successfully created a new hierarchy. If you would like to edit the hierarchy, please continue in EDIT mode.");
	}

	@Test(priority = 2)
	public void invalidUpload() throws Exception {

		HierarchyHomePage hierHome = new HierarchyHomePage();

		hierHome.clickCreatePage();

		CreateHierarchyPage cp = new CreateHierarchyPage();
		cp.createNewHierarchyWithInvalidFile();

		Assert.assertTrue(cp.checkInvalidUpload());

	}

	@Test(priority = 3)
	public void emptyFileUpload() throws Exception {

		HierarchyHomePage hierHome = new HierarchyHomePage();

		hierHome.clickCreatePage();

		CreateHierarchyPage cp = new CreateHierarchyPage();
		cp.emptyFileUpload();

		Assert.assertTrue(cp.checkEmptyFileUpload());

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
