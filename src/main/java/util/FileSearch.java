package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {

	private String fileName;
	private List<String> result = new ArrayList<String>();

	/**
	 * 
	 * @param baseDirectory
	 * @param fileName
	 * @return
	 */
	public List<String> searchFile(File baseDirectory, String fileName) {
		setFileName(fileName);
		if (baseDirectory.isDirectory()) {
			search(baseDirectory);
		} else {
			System.out.println(baseDirectory.getAbsoluteFile()
					+ " is not a directory!");
		}
		return result;
	}

	/**
	 * 
	 * @param file
	 */
	private void search(File file) {
		if (file.isDirectory()) {
			System.out.println("Searching directory - "
					+ file.getAbsoluteFile());
			// do you have permission to read this directory?
			if (file.canRead()) {
				for (File temp : file.listFiles()) {
					if (temp.isDirectory()) {
						search(temp);
					} else {
						if (getFileName().equals(temp.getName())) {
							result.add(temp.getAbsoluteFile().toString());
						}

					}
				}
			} else {
				System.out.println(file.getAbsoluteFile()
						+ "Permission Denied for accessing this folder");
			}
		}
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
