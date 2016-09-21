package udemy;

import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		String originalnumber = input.nextLine();

		String nn1 = "tamengmengda";

		while (nn1.length() != 1) {
			int nn = 0;
			for (int i = originalnumber.length(); i >= 1; i--) {
				int on1 = Integer.parseInt(String.valueOf(originalnumber.charAt(i - 1)));

				nn = nn + on1;
				System.out.printf("%d + %d = %d%n", (nn-on1), on1, nn);

			}

			nn1 = Integer.toString(nn);
			originalnumber = nn1;
		}
		System.out.println(nn1);
	}

}
