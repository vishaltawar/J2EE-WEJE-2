package com.jspider.designpattern.factory.main;

import java.util.Scanner;

import com.jspider.designpattern.factory.fastfood.Burger;
import com.jspider.designpattern.factory.fastfood.ColdCoffee;
import com.jspider.designpattern.factory.fastfood.Fries;
import com.jspider.designpattern.factory.fastfood.Pasta;
import com.jspider.designpattern.factory.interfaces.FastFood;

public class FastFoodMain {
	static FastFood fastFood;
	static boolean loop = true;

	public static void main(String[] args) {
		try {
			cafe().orderFood();
		} catch (NullPointerException e) {
			System.out.println("Your Fast Food is Not Orderd");
		}
	}

	public static FastFood cafe() {
		while (loop) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Select Your Order :\n 1. Pizza\n 2. Burger\n 3. Pasta\n 4. Fries\n 5. Cold Coffee");
			System.out.print("\nChoose :- ");
			int choise = scanner.nextInt();
			scanner.close();
			switch (choise) {
			case 1:
				fastFood = new Pasta();
				loop = false;
				return fastFood;
			case 2:
				fastFood = new Burger();
				loop = false;
				return fastFood;

			case 3:
				fastFood = new Pasta();
				loop = false;
				return fastFood;

			case 4:
				fastFood = new Fries();
				loop = false;
				return fastFood;

			case 5:
				fastFood = new ColdCoffee();
				loop = false;
				return fastFood;

			default:
				System.out.println("Invalid choise");
				loop = false;
				return fastFood;
			}
		}
		return fastFood;
	}
}
