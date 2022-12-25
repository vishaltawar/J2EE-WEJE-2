package com.jspider.filehandling.filecreate;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo2 {

	public static void main(String[] args) {
		File file = new File("D:DemoFile.txt");//Create file inside where Project location folder present only.
		try {
			file.createNewFile();
			System.out.println("File Created Succesfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
