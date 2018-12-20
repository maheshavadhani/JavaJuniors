package Basics;

import java.util.Scanner;

class StringBuild {

	void Stringbuild() {
		StringBuilder S = new StringBuilder();
		S.append("Hi Mr.");
		System.out.println(S);
		S.append("Mahesh");
		System.out.println(S);
		S.insert(12, "Learn Well");
		System.out.println(S);
	}

	static Scanner input = new Scanner(System.in);

	void Palindrome() {
		StringBuilder SB = new StringBuilder();
		System.out.println("Enter the palindrome number");
		String Str;
		SB.append(Str = input.nextLine());
		SB.reverse();
		String S = SB.toString();
		System.out.println("Entered:" + Str + ",reverse:" + S);
		if (Str.equals(S)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}

public class StringBuffer {
	public static void main(String[] args) {

		StringBuild S = new StringBuild();
		S.Stringbuild();
		S.Palindrome();
	}

}
