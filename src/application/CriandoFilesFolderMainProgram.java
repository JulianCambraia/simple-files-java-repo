package application;

import java.io.File;
import java.util.Scanner;

public class CriandoFilesFolderMainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho da pasta:");
		String strPath = sc.next();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("LISTANDO SOMENTE PASTAS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File:: isFile);
		System.out.println("LISTANDO SOMENTE ARQUIVOS");
		for (File file : files) {
			System.out.println(file);
		}
		
		Boolean sucesso = new File(strPath + "/SubDir").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucesso);
		
		sc.close();

	}

}
