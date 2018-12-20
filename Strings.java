package Basics;

public class Strings {

	public static void main(String args[]) {
		String S = "Sachin";
		String T = "Sachin";
		String F = S.concat("Tendulkar");
		System.out.println(F);
		System.out.println(S);
		String N = S.replaceAll("Sachin", "Jersey 10");
		System.out.println(N);
		System.out.println(S.length());
		System.out.println(S.indexOf("c"));
		System.out.println(S.compareTo(T));

	}

}