package com.jspider.filehandling.filesetget;

import java.io.File;
import java.io.IOException;

public class FileReadWrite {
	public static void main(String[] args) {
		File file=new File("DemoFile1");
		try {
			file.createNewFile(); 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		file.setWritable(true);
//		file.setReadable(false);
//		file.setExecutable(false);
		
		if(file.canRead()) {	
			System.out.println("File is Readeble");
		}else {
			System.out.println("File is Not Readeble");
		}
		
		if(file.canWrite()) { 
			System.out.println("File is Writable");
		}else {
			System.out.println("File is Not Writable");
		}
		
		if(file.canExecute()) { 
			System.out.println("File is Executable");
		}else {
			System.out.println("File is Not Executable");
		}
		System.out.println(file.length()); 
			
	}

}
