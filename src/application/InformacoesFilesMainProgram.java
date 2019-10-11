package application;

import java.io.File;
import java.util.Scanner;

public class InformacoesFilesMainProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o caminho do arquivo:");
		String strPath = sc.next();
		File path = new File(strPath);
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getFreeSpace: " + path.getFreeSpace());
		sc.close();
		
	}
}
