package udemy;

import java.util.Scanner;

public class PersonType {
	public static void main(String[] args) {
		int age;
		boolean gender = false;

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the age:");
		age = input.nextInt();
		System.out.println("Please input the gender:");
		String b = input.next();

		if (b.equals("male")) {
			gender = false;
		} else if (b.equals("female)")) {
			gender = true;
		}

		if (age < 1) {
			System.out.println("Infant");
			return;
		} else if (age >= 1 && age < 3) {
			System.out.println("Toddler");
			return;
		} else if (age >= 3 && age < 5) {
			System.out.println("Pre School");
			return;
		} else if (age >= 5 && age < 6 && gender == true) {
			System.out.println("KG Girl");
			return;
		} else if (age >= 5 && age < 6 && gender == false) {
			System.out.println("KG Boy");
			return;
		} else {
			System.out.println("I don't know what it is.");
			return;
		}

	}

}
