package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

	public static void waitUntilClicked(String xPath, WebDriver driver) throws Exception {

		for (int i = 0; i < 12; i++) {
			try {
				Thread.sleep(10000);
				driver.findElement(By.xpath(xPath)).click();
				break;

			} catch (Exception e) {

				System.out.println("Attempting to click count " + i);
				e.printStackTrace();

			}

			if (i == 29) {
				throw new Exception("Failed to click element");
			}
		}

	}

	public static void waitUntilClicked(By webElement, WebDriver driver) throws Exception {

		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(6000);
				driver.findElement(webElement).click();
				System.out.println();
				break;

			} catch (Exception e) {
				System.out.println("Attempting to click count " + i);
				e.printStackTrace();
			}
			if (i == 14) {
				throw new Exception("Failed to click element");
			}
		}

	}
}
