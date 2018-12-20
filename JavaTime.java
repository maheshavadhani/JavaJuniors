package Basics;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class JavaTime {

	public static void main(String[] args) {
		LocalDateTime timesnow = LocalDateTime.now();

		int date = timesnow.getDayOfMonth();
		System.out.println("Date: " + date);

		DayOfWeek D = timesnow.getDayOfWeek();
		System.out.println("Day : " + D);

		Month month = timesnow.getMonth();
		System.out.println("Month: " + month);

		int Y = timesnow.getYear();
		System.out.println("Year: " + Y);

		System.out.println("time is:" + timesnow);

	}
}
