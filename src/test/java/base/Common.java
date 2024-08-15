package base;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utils.ConfigLoader;

public class Common {

	public static WebDriver driver;
	private static WebDriverWait wait;
	public static ChromeOptions chromeOptions = new ChromeOptions();

	public Common() {
		if (driver == null) {
			driver = intializeDriver();
			wait = new WebDriverWait(driver, 60);
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {

		return wait;
	}

	/**
	 * loading base url with End point as argument
	 */
	public void load(String endPoint) {

		driver.get(ConfigLoader.getConfigProperty("baseUrl") + endPoint);
	}

	/**
	 * Screenshot function for failed test cases
	 * 
	 * @throws IOException
	 * @throws MessagingException
	 */
	@AfterTest
	public static void failScreenshotAndSendMail(ITestResult result) throws IOException, MessagingException {

		File desFile = new File("screenshots" + File.separator + result.getTestClass().getRealClass().getSimpleName()
				+ "_" + result.getMethod().getMethodName() + ".png");
		takeScreenshotUsingShutterbug(desFile);
		// String Filepath = desFile.getPath();
		// MailUtils.sendMail(result, Filepath);

	}

	public static void quitdriver() {
		driver.quit();
		driver = null;
	}

	/**
	 * Initializing the Webdriver
	 * 
	 */
	public WebDriver intializeDriver() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");

		// changing download directory

		String path = System.getProperty("user.dir") + "\\downloadedFiles";

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", path);

		// chromeOptions.setCapability("download.default_directory", path);

		chromeOptions.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		// driver.get(ConfigLoader.getConfigProperty("baseUrl"));
		return driver;

	}

	@SuppressWarnings("unused")
	private void takeScreenshot(File destFile) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, destFile);
	}

	@SuppressWarnings("unused")
	public static void takeScreenshotUsingAShot(File destFile) {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void takeScreenshotUsingShutterbug(File destFile) {

		Image image = Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, 2000).withName("FullPageScreenshot")
				.getImage();
		try {
			ImageIO.write((RenderedImage) image, "PNG", destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Scrolling to the point where web element is located
	 * 
	 * @param webelement
	 */
	protected void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	/**
	 * function for overlays to disappear
	 * 
	 * @param overlay
	 * @throws InterruptedException
	 */
	public static void waitForOverlaysToDisappear(By overlay) throws InterruptedException {

		while (driver.findElements(overlay) != null && driver.findElements(overlay).size() > 0) {
			Thread.sleep(2000);
		}

		System.out.println("Overlay size after thread sleep :" + driver.findElements(overlay).size());

	}

}
