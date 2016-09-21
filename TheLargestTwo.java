package udemy;

import java.util.Scanner;
import java.util.ArrayList;

public class TheLargestTwo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter numbers and with any character or symbol.");

		do {
			list.add(input.nextInt());
		} while (input.hasNextInt());
		input.close();

		int a = 0;
		int b = 0;
		if (list.get(0) > list.get(1)) {
			a = list.get(0);
			b = list.get(1);
		} else {
			b = list.get(0);
			a = list.get(1);
		}

		for (int i = 2; i < list.size(); i++) {

			if (list.get(i) >= a && list.get(i) >= b) {
				b = a;
				a = list.get(i);

			} else if (list.get(i) >= b && list.get(i) <= a) {
				b = list.get(i);

			} else if (list.get(i) < a && list.get(i) < b) {

			}

		}
		System.out.println("The largest two numbers are " + a + " " + b);

	}

}
