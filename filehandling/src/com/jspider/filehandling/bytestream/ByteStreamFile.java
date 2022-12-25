package com.jspider.filehandling.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamFile {
	public static void main(String[] args) {
		File file = new File("ByteStreamFile.txt");
		if (!file.exists()) {
			System.out.println("File Is already Exists !!!");
		} else {
		
			try {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("File is Created Successfully");
				
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(33);
				fileOutputStream.close();
				
				FileInputStream fileInputStream = new FileInputStream(file);
				System.out.println(fileInputStream.read());
				System.out.println("File Read successfully");
				fileInputStream.close();
				

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
