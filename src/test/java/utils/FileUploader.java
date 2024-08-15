package utils;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Common;

public class FileUploader extends Common {

	/**
	 * Function used to upload the csv file.
	 * 
	 * public static void fileUpload(String fileName, By xpath)
	 * 
	 *
	 */
	public static void fileUpload(String fileName, By xpath) {

		Path filepath = Paths.get("resources", fileName); // getting the file path

		String absolutePath = filepath.toFile().getAbsolutePath();

		WebElement fileInput = getDriver().findElement((xpath)); 

		fileInput.sendKeys(absolutePath);

	}

}
