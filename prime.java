package udemy;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {

		int b = 1;

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		for (int i = 2; i < number; i++) {
			int a = number % i;
			if (a == 0) {
				System.out.println("This number " + number + " is not a prime number.");
				b = a * b; // I can't find other method to figure out whether
							// this "if" has been executed or not
				break;
			}

		}
		if (b != 0) {
			System.out.println("This number " + number + " is a prime number.");
		}

	}

}
