package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		try {
		File file = new File("src/main/java/activities/textFile.txt");
		boolean fStatus = file.createNewFile();
		
		if(fStatus) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists at this path.");
        }
		
		File fileUtil = FileUtils.getFile("src/main/java/activities/textFile.txt");
		System.out.println("Reading the file: \n" + FileUtils.readFileToString(fileUtil, "UTF8"));
		
		File newDir = new File("newDirectory");
		FileUtils.copyFile(file, newDir);
		
		File newFile = FileUtils.getFile(newDir, "textFile.txt");
		String fileData = FileUtils.readFileToString(newFile, "UTF8");
		
		System.out.println("Reading the file: " + fileData);
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
