package com.jspider.filehandling.filecreate;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo3 {
	public static void main(String[] args) {
		File file = new File("D:\\WEJE-2\\DemoFile.txt");//Create file inside the perticuler folder
		try {
			file.createNewFile();
			System.out.println("File Created Succesfully");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
