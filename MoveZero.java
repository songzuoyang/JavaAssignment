package udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();

		System.out.println("Please enter numbers and with any character or symbol.");

		do {
			list1.add(input.nextInt());
		} while (input.hasNextInt());
		input.close();

		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != 0) {
				list2.add(list1.get(i));
			} else if (list1.get(i) == 0) {
				list3.add(list1.get(i));
			}
		}

		for (int i = 0; i < list2.size(); i++) {
			list4.add(list2.get(i));
		}

		for (int i = 0; i < list3.size(); i++) {
			list4.add(list3.get(i));
		}

		/*for (int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));
		}*/
		
		for(Integer value : list4) {
			System.out.println(value);
		}

	}

}
