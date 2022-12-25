package com.jspider.serializationdesirialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.jspider.serializationdesirialization.serializable.User;

public class UserMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many record you want to enter in file :- ");
		int noOfRecord = scanner.nextInt();
		for (int i = 1; i <= noOfRecord; i++) {
			System.out.println("Enter " + i + " Record, ");
			System.out.print("Enter ID :- ");
			int id = scanner.nextInt();
			System.out.print("Enter username :- ");
			String useName = scanner.next();
			System.out.print("Enter Password :- ");
			String password = scanner.next();

			User user = new User(id, useName, password);
			File file = new File("D:\\file.txt");

			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);

				try {
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
					objectOutputStream.writeObject(user);
					// System.out.println("File is writen");
					objectOutputStream.close();
					FileInputStream fileInputStream = new FileInputStream(file);
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
					// User userIn;
					try {
						//User userIn = (User) objectInputStream.readObject();
						//System.out.println(userIn);
						//			OR   directly inside SOP (statement)
						System.out.println(objectInputStream.readObject());
						// System.out.println("File read Successfully");
						objectInputStream.close();
					} catch (ClassNotFoundException e) {

						e.printStackTrace();
					}
				} catch (IOException e) {

					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			System.out.println();
		}
		scanner.close();

	}

}
