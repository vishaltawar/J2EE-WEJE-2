package com.jspider.filehandling.filecreate;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo1 {
	public static void main(String[] args) {
		File file = new File("DemoFile.txt");//Create file inside the Project location folder
		try {
			file.createNewFile();
			System.out.println("File Created Succesfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
