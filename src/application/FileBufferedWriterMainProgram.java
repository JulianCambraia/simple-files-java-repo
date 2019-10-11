package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriterMainProgram {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good Morinig", "Good Afternoon", "Good Evenig", "Good Night" };
		String path = "/tmp/out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String linha : lines) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
