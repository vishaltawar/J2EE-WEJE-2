package com.jspider.math;

import java.util.Scanner;

import com.jspider.math.Area.Area;
import com.jspider.math.circumference.Circumference;
import com.jspider.math.perimeter.Perimeter;
import com.jspider.math.volume.Volume;

public class Math {
	static Math math = new Math();
	static boolean l = true;

	public static void main(String[] args) {

		while (l) {
			math.mathOperation();
		}

	}

	public void mathOperation() {
		Area area = new Area();
		Volume volume = new Volume();
		Circumference circumference = new Circumference();
		Perimeter perimeter = new Perimeter();
		System.out.println(
				"Choose Following Operation :-\n1 :- Area\n2 :- Volume\n3 :- Peremeter\n4 :- Circumference\n5 :- Exist");
		Scanner scanner = new Scanner(System.in);
		int choise = scanner.nextInt();
		switch (choise) {
		case 1:// Area
			System.out.println(
					"Choose What You Want :-\n1 :- Squere\n2 :- Rectangle\n3 :- Cylinder\n4 :- Circul\n5 :- Sphere\n6 :- Back");
			choise = scanner.nextInt();
			switch (choise) {
			case 1:// Squere
				System.out.println("Enter side");
				float side = scanner.nextFloat();
				area.square(side);
				break;
			case 2:// Rectangle
				System.out.println("Enter Length");
				float length = scanner.nextFloat();
				System.out.println("Enter Base");
				float base = scanner.nextFloat();
				area.rectangle(length, base);
				break;
			case 3:// Cylinder
				System.out.println("Enter Redius");
				float redius = scanner.nextFloat();
				System.out.println("Enter Heigth");
				float heigth = scanner.nextFloat();
				area.cylinder(redius, heigth);

				break;
			case 4:// Circul
				System.out.println("Enter Redius");
				redius = scanner.nextFloat();
				area.circul(redius);

				break;
			case 5:// Sphere
				System.out.println("Enter Redius");
				redius = scanner.nextFloat();
				area.sphere(redius);
				break;
			case 6:// Back
				math.mathOperation();

				break;

			default:
				System.out.println("Invalid Choise !!");
				break;
			}
			break;
		case 2:// Volume
			System.out.println(
					"Choose What You Want :-\n1 :- Squere\n2 :- Rectangle\n3 :- Cylinder\n4 :- Circul\n5 :- Back");
			choise = scanner.nextInt();
			switch (choise) {
			case 1:// Squere
				System.out.println("Enter side");
				float side = scanner.nextFloat();
				System.out.println("Enter Heigth");
				float heigth = scanner.nextFloat();
				volume.square(side, heigth);
				break;
			case 2:// Rectangle
				System.out.println("Enter Length");
				float length = scanner.nextFloat();
				System.out.println("Enter Base");
				float base = scanner.nextFloat();
				System.out.println("Enter Heigth");
				heigth = scanner.nextFloat();
				volume.rectangle(length, base, heigth);
				break;
			case 3:// Cylinder
				System.out.println("Enter Redius");
				float redius = scanner.nextFloat();
				System.out.println("Enter Heigth");
				heigth = scanner.nextFloat();
				volume.cylinder(redius, heigth);
				break;
			case 4:// Circul
				System.out.println("Enter Redius");
				redius = scanner.nextFloat();
				volume.circul(redius);
				break;

			case 5:// Back
				math.mathOperation();
				break;

			default:
				System.out.println("Invalid Choise !!");
				break;
			}

			break;
		case 3:// Peremeter
			System.out.println(
					"Choose What You Want :-\n1 :- Squere\n2 :- Rectangle\n3 :- Cylinder\n4 :- Circuln5 :- Back");
			choise = scanner.nextInt();
			switch (choise) {
			case 1:// Squere
				System.out.println("Enter side");
				float side = scanner.nextFloat();
				perimeter.square(side);
				break;
			case 2:// Rectangle
				System.out.println("Enter Length");
				float length = scanner.nextFloat();
				System.out.println("Enter Base");
				float base = scanner.nextFloat();
				perimeter.rectangle(length, base);
				break;
			case 3:// Cylinder
				System.out.println("Enter Redius");
				float redius = scanner.nextFloat();
				System.out.println("Enter Heigth");
				float heigth = scanner.nextFloat();
				perimeter.cylinder(redius, heigth);

				break;
			case 4:// Circul
				System.out.println("Enter Redius");
				redius = scanner.nextFloat();
				perimeter.circul(redius);

				break;

			case 5:// Back
				math.mathOperation();

				break;

			default:
				System.out.println("Invalid Choise !!");
				break;
			}

			break;
		case 4:// Circumference
			System.out.println("Choose What You Want :-\n1 :- Circul\n2 :- Exist");

			choise = scanner.nextInt();
			switch (choise) {
			case 1:// Squere
				System.out.println("Enter Redius");
				float redius = scanner.nextFloat();
				circumference.circul(redius);
				break;
			case 2:// Back
				math.mathOperation();

				break;

			default:
				System.out.println("Invalid Choise !!");
				break;
			}

			break;
		case 5:// Exist
			l = false;
			System.out.println("Thank You");

			break;

		default:
			System.out.println("Invalid Choise !!");
			break;
		}
	}

}
