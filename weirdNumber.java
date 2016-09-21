package udemy;

import java.util.Scanner;

public class weirdNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a % 2 != 0) {
			System.out.println("Weird");

		} else if (a % 2 == 0 && a > 2 && a <= 5) {
			System.out.println("Not Weird");

		} else if (a % 2 == 0 && a > 5 && a <= 20) {
			System.out.println("Weird");

		} else if (a % 2 == 0 && a > 20) {
			System.out.println("Not Weird");

		}
	}

}
