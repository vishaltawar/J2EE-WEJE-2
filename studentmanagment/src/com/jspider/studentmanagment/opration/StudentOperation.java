package com.jspider.studentmanagment.opration;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.studentmanagment.student.Student;

public class StudentOperation {
	ArrayList<Student> studentsList = new ArrayList<Student>();
	
	// Add Student
	public void addStudent() {
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Student Id : ");
		student.setId(scanner.nextInt());

		System.out.print("Enter First Name : ");
		student.setFirstName(scanner.next());
		
		System.out.print("Enter Last Name : ");
		student.setLastName(scanner.next());

		System.out.print("Enter Email : ");
		student.setEmali(scanner.next());

		System.out.print("Enter Mobile Number : ");
		student.setMobile(scanner.nextLong());

		System.out.print("Enter Date Of Birth : ");
		student.setDob(scanner.next());

		System.out.print("Enter Cource Name : ");
		student.setCourse(scanner.next());

		System.out.print("Enter Student Degree : ");
		student.setDegree(scanner.next());

		System.out.print("Enter Student Branch : ");
		student.setBranch(scanner.next());

		System.out.print("Enter Student Gender : ");
		student.setGender(scanner.next());

		System.out.print("Enter Blood Group : ");
		student.setBloodGroup(scanner.next());

		System.out.print("Enter Aadhar Number : ");
		student.setAadhar(scanner.nextLong());

		studentsList.add(student);
		System.out.println("Student Added Successfully.");
		scanner.close();
	}

	// View All Student
	public void viewAllStudent() {
		if (studentsList.isEmpty()) {
			System.out.println("Sorry Student is Not Available in Student List.");
			
		} else {
			System.out.println("List Of All Student :-");
			for (int i = 0; i < studentsList.size(); i++) {

				System.out.println(i + 1 + " : " + studentsList.get(i));

			}
		}
		

	}
	
	// Delete Student
		public void deleteStudent(int choise) {
			if (studentsList.isEmpty()) {
				System.out.println("Sorry Song is Not Available in Playlist.");
			} else {
				if (choise <= studentsList.size()) {
					System.out.println(studentsList.get(choise - 1) + " Delete Successfully,");
					studentsList.remove(choise - 1);
				} else {
					System.out.println(choise + " is Not Present in List.");
				}

			}

		}
		
		// Edit Song
		public void editStudent() {
			if (studentsList.isEmpty()) {
				System.out.println("Sorry Student is Not Available in Student List.");
			} else {

				Scanner scanner = new Scanner(System.in);
				System.out.print("Which song you want to Edit Choose No. :- ");
				int index = scanner.nextInt();
				System.out.println("What you want to Edit :-");
				System.out.println(
						"\n 1 : id\n 2 : Song name\n 3 : Movie/Album name \n 4 : Composer\n 5 : Length \n 6 : Lyrics Creater\n 7 : Back");
				int choise = scanner.nextInt();
				switch (choise) {
				case 1:
					System.out.print("Enter Student Id : ");
					studentsList.get(index - 1).setId(scanner.nextInt());
					break;
				case 2:
					System.out.print("Enter Student First Name : ");
					studentsList.get(index - 1).setFirstName(scanner.next());
					break;
				case 3:
					System.out.print("Enter Student Last Name : ");
					studentsList.get(index - 1).setLastName(scanner.next());
					break;
				case 4:
					System.out.print("Enter Student Email Id : ");
					studentsList.get(index - 1).setEmali(scanner.next());
					break;
				case 5:
					System.out.print("Enter Student Mobile Numbe : ");
					studentsList.get(index - 1).setMobile(scanner.nextLong());
					break;
				case 6:
					System.out.print("Enter Date of Birth : ");
					studentsList.get(index - 1).setDob(scanner.next());
					break;
				case 7:
					System.out.print("Enter Strudent Course : ");
					studentsList.get(index - 1).setCourse(scanner.next());
					break;
				case 8:
					System.out.print("Enter Strudent Degree : ");
					studentsList.get(index - 1).setDegree(scanner.next());
					break;
				case 9:
					System.out.print("Enter Strudent Branch : ");
					studentsList.get(index - 1).setBranch(scanner.next());
					break;
				case 10:
					System.out.print("Enter Strudent Gender : ");
					studentsList.get(index - 1).setGender(scanner.next());
					break;
				case 11:
					System.out.print("Enter Strudent Blood Group : ");
					studentsList.get(index - 1).setBloodGroup(scanner.next());
					break;
				case 12:
					System.out.print("Enter Strudent Aadhar Number : ");
					studentsList.get(index - 1).setAadhar(scanner.nextLong());
					break;
				case 13:
					break;

				default:
					System.out.println("Invalid choise...");
					break;
				}
				System.out.println("Update Successfull.");

			}


		}
}
