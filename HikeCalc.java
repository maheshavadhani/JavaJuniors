package Basics;

import java.util.Scanner;

public class HikeCalc {

	public static void main(String[] args) {
		int OldSal;
		int NewSal;
		int Increment;
		float Percentage;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter newsal in digits:");
		NewSal = input.nextInt();
		System.out.println("Enter oldsal:");
		OldSal = input.nextInt();

		Increment = NewSal - OldSal;
		System.out.println("Increment is:" + Increment);

		Percentage = (Increment / (float) OldSal) * 100;
		System.out.println("Hike is:" + Percentage + "%");
		input.close();
	}

}
