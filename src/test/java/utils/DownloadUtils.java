package utils;

import java.io.File;

/**
 * Function to verify the downloaded file
 */
public class DownloadUtils {
	public static boolean downloadFile(String fileName) {

		String downloadDir = System.getProperty("user.dir") + "\\downloadedFiles";

		// Check if the file exists in the download directory
		File folder = new File(downloadDir);
		File[] files = folder.listFiles(new CsvFileFilter());

		for (File file : files) {
			if (file.getName().contains(fileName)) {
				if (files != null && files.length > 0) {
					File csvFile = files[0];
					// Perform additional verifications
					if (csvFile.length() > 0) {

						System.out.println("CSV file downloaded successfully!");
						return true;
					} else {

						System.out.println("CSV file is empty.");
						return false;
					}
				}
			} else {

				System.out.println("CSV file was not downloaded.");
				return false;
			}
		}
		return false;
	}

	private static class CsvFileFilter implements java.io.FilenameFilter {
		@Override
		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(".csv");
		}
	}

	/*
	 * public static void main(String[] args) {
	 * System.out.println(System.getProperty("user.dir")); }
	 */
}
