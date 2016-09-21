package udemy;

import java.util.Scanner;

public class fibonacciNumber {
	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner input = new Scanner(System.in);

		System.out.println(fibonacci(input.nextInt()));
	}

	public static int fibonacci(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
