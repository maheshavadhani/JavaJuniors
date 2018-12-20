package project.todolist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFunction {

	private static TodoListSample myTodoList = new TodoListSample();
	private static Scanner input = new Scanner(System.in);

	public static void printTodoList() {
		myTodoList.printTodoList();
	}

	public static void addToList() {
		System.out.println("Enter the item for todo");
		myTodoList.addItem(input.nextLine());

	}

	public static void removeFromList() {
		System.out.println("Enter the item index to remove from todo");
		myTodoList.removeItem(input.nextInt());
	}

	public static void updateList() throws IndexOutOfBoundsException {
		try {
			System.out.println("Enter the index");
			int index = input.nextInt();
			input.nextLine();
			System.out.println("Enter the item to add");
			String item = input.nextLine();
			myTodoList.updateItem(index, item);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Check your index,seems to be incorrect index");
			updateList();
		}
	}

	public static void searchList() {
		System.out.println("Enter the search string:");
		String S = input.nextLine();
		myTodoList.searchItem(S);
	}

	public static void commandlist() {
		System.out.println("\n 0: to print todolist" + "\n 1: to add to todolist" + "\n 2: to remove todolist"
				+ "\n 3: to update" + "\n 4: to seacrch" + "\n 5: to exit");
	}

	public static void main(String[] args) throws InputMismatchException {
		int command = 0;
		boolean exit = false;
		commandlist();
		try {
			while (!exit) {
				System.out.println("Enter the command");
				command = input.nextInt();
				input.nextLine();
				switch (command) {
				case 0:
					printTodoList();
					break;
				case 1:
					addToList();
					break;
				case 2:
					removeFromList();
					break;
				case 3:
					updateList();
					break;
				case 4:
					searchList();
					break;
				case 5:
					exit = true;
					System.out.println("I am exiting");
					break;
				default:
					System.out.println("Enter 0 to 5");
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Please enter digits 1 to 5 " + "error:" + e);

		}
	}

}
