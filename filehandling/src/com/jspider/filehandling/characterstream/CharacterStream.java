package com.jspider.filehandling.characterstream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStream {
	public static void main(String[] args) {
		File file = new File("CharcterSteam.txt");
		if (!file.exists()) {
			System.out.println("File is already Exists");
			// file.delete();
		} else {
			try {
				file.createNewFile();
				System.out.println("File is Create Successfully");

				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("This is character file Now we can achive this file with help of Scanner Class ");
				fileWriter.write("This is character file Now we can achive this file with help of Scanner Class ");
				fileWriter.write("This is character file Now we can achive this file with help of Scanner Class ");
				fileWriter.close();
				FileReader fileReader = new FileReader(file);

				System.out.println(fileReader.read());
				System.out.println("File is Read Successfully");
				fileReader.close();
				Scanner scanner = new Scanner(file);
				//if (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
					scanner.close();
				//}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
