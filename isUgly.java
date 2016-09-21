package udemy;

import java.util.Scanner;

public class isUgly {
	public static void main(String[] args) {

		int b = 1;
		int c = 1;

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		for (int i = 2; i < number; i++) {
			int a = number % i;
			if (a == 0) {
				if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
					System.out.printf("%d is not an ugly number.", number);
					b++;
					break;
				}
				c = a * c;
			}

		}
		if (c == 0 && b == 1) {
			System.out.printf("%d is an ugly number.", number);
		} else if (c != 0) {
			System.out.println("This number " + number + " is a prime number.");
		}

	}

}
