import java.util.Scanner;
import util.FileHandling;


public class Main {

	private static Scanner in;

	/**
	 * Main method to test some Utils - move it to test case later on 
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Please enter the file name to search for --> ");
		new FileHandling().isFileExists(in.nextLine());
	}

}
