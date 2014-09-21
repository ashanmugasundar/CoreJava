package main;
import java.io.File;
import java.util.List;
import java.util.Scanner;

import util.FileSearch;


public class Main {

	private static Scanner in;

	/**
	 * Main method to test some Utils - move it to test case later on 
	 */
	public static void main(String[] args) {
		//Prepare the reader & read the user input
		in = new Scanner(System.in);
		System.out.println("Please enter the file name to search for --> ");
		String filename = in.nextLine();
		System.out.println("Please enter the root Directory(If windows, E.g. C:\\Sundar\\Personal\\Learnings 2013\\workspace\\CoreJava\\src format please )--> ");
		String baseDirectory = in.nextLine();
		
		//Invoking File search util
		FileSearch fileSearch = new FileSearch();
		List<String> result = fileSearch.searchFile(new File(baseDirectory),filename);
		int count = result.size();
		if (count == 0) {
			System.out.println("\nNo result found. Please double check the filename or directory!");
		} else {
			System.out.println("\n" + count + " result matched!\n");
			for (String matched : result) {
				System.out.println("Found : " + matched);
			}
		}
		
	}

}
