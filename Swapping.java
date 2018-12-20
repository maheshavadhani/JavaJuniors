package Basics;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = input.nextInt();
		System.out.println("Enter 2nd number");
		int b = input.nextInt();
		input.close();
		System.out.println("Before swapping" + "\na=" + a + "\nb=" + b);

		swap(a, b); // method 1 using 3rd variable

		// method 2 - without 3rd variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping" + "\na=" + a + "\nb=" + b);
	}

	public static void swap(int a, int b) {
		int tmp = a; // tmp=10,a=0
		a = b; // a=20,b=20
		b = tmp; // b=10
		System.out.println("After swapping " + "\na=" + a + "\nb=" + b);

	}

}
