package Basics;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter any String :");
		Scanner input = new Scanner(System.in);
		String Actual = input.nextLine();
		while (Actual == null | Actual.isEmpty()) {
			System.out.println("Enter a valid string");
			Actual = input.nextLine();
		}
		System.out.println("Actual:" + Actual);
		input.close();
		StringReverse S = new StringReverse();
		S.reverse(Actual);

	}

	public String reverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse:" + reverse);
		return reverse;
	}

}
