package udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestTwo {
	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		while (input.hasNextLine()) {
			numbers.add(input.nextInt());
		}
		System.out.println(numbers.get(1));
	}

}
