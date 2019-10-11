package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileComScannerMainProgram {

	public static void main(String[] args) {
		File file = new File("/tmp/in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
