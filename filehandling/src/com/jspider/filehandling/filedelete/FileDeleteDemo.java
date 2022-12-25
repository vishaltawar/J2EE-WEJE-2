package com.jspider.filehandling.filedelete;

import java.io.*;

public class FileDeleteDemo {

	public static void main(String[] args) {
		File file = new File("DemoFile1");
//		try {
//			file.createNewFile();
//			System.out.println("File Create Successfully");
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		if(file.exists()) {
			
			file.delete();
			System.out.println("File Delete Successfully");
		}else {
			System.out.println("File  Not Found");
		}

	}

}
