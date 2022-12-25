package com.jspider.studentmanagment.college;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.jspider.studentmanagment.opration.StudentOperation;

public class College {
	StudentOperation operation = new StudentOperation();
	static boolean loop = true;

	public static void main(String[] args) {
		int i = 2;
		College college = new College();
		while (loop) {
			college.studentManagment();
			System.out.println();

		}
	}

	public void studentManagment() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Imformation of College Student :-\n1 :- Add/Remove Student\n2 :- Edit Student Details\n3 :- View Students\n4 :- Exist");
		System.out.print("Choose Operation :- ");
		int choise = scanner.nextInt();
		switch (choise) {
		case 1:// Add/Remove
			System.out.println("1 :- Add Student\n2 :- Remove Student\n3 :- Exist");
			choise = scanner.nextInt();
			switch (choise) {
			case 1:// Add
				operation.addStudent();
				operation.viewAllStudent();

				break;

			case 2:// Remove
				operation.viewAllStudent();
				System.out.print("Which Student you want to Remove Please Choose a No. :- ");
				choise = scanner.nextInt();
				operation.deleteStudent(choise);
				break;

			case 3:// Exist

				break;

			default:
				break;
			}

			break;
		case 2:// Edit
			operation.viewAllStudent();
			try {
				operation.editStudent();

			} catch (InputMismatchException e) {
				System.out.println("Wrong Input..");
			}

			break;
		case 3:// View Students
			operation.viewAllStudent();

			break;
		case 4:// Exist
			loop = false;
			System.out.println("Thank You.");

			break;

		default:
			System.out.println("Invalid choise...");
			break;
		}

	}
}
