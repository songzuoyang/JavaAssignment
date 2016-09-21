package udemy;

import java.util.Scanner;

public class olleh {
	public static void main(String[] args) {
		String original;

		StringBuilder sb = new StringBuilder(" ");

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a word.");

		original = input.nextLine();
		for (int i = original.length(); i >= 1; i--) {
			char a = original.charAt(i - 1);
			sb.append(a);

		}
		input.close();

		System.out.println(sb);

	}

}
