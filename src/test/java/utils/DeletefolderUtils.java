package utils;

import java.io.File;

public class DeletefolderUtils {
	public static void cleanup() {

		// Specify the path to the folder you want to delete files from
		String folderPath = System.getProperty("user.dir") + "\\downloadedFiles";

		// Create a File object representing the folder
		File folder = new File(folderPath);

		// Check if the folder exists and is a directory
		if (folder.exists() && folder.isDirectory()) {
			// Get the list of files in the folder
			File[] files = folder.listFiles();

			// Iterate through the files and delete each one
			for (File file : files) {
				if (file.isFile()) {
					boolean isDeleted = file.delete();
					if (isDeleted) {
						System.out.println("Deleted file: " + file.getName());
					} else {
						System.out.println("Failed to delete file: " + file.getName());
					}
				}
			}
		} else {
			System.out.println("Folder does not exist or is not a directory.");
		}
	}
}