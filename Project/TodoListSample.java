package project.todolist;

import java.util.ArrayList;

public class TodoListSample {

	ArrayList<String> todoList = new ArrayList<>();

	public void addItem(String item) {
		todoList.add(item);
	}

	public void removeItem(int index) {
		String removeitem = todoList.get(index);
		todoList.remove(index);
		System.out.println("Removed item:" + "'" + removeitem + "'");
	}

	public void updateItem(int index, String item) {
		todoList.set(index, item);
		System.out.println("update completed at position " + index);

	}

	public void printTodoList() {
		if (todoList.size() == 0) {
			System.out.println("List is empty");
		}
		for (int i = 0; i < todoList.size(); i++) {
			System.out.println("todoList " + i + " is " + todoList.get(i));
		}
	}

	public String searchItem(String item) {
		if (todoList.contains(item)) {
			System.out.println("Your search " + "'" + item + "'" + " is present");
			return item;
		} else {
			System.out.println(item + " is not present");
			return null;
		}
	}
}
