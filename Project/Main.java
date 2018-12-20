package project.todolist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TodoListSample T = new TodoListSample();
		T.addItem("Issue Call");
		T.addItem("Sprint Review");
		T.addItem("Sprint Demo");
		for (int j = 0; j < T.todoList.size(); j++) {
			System.out.println("Your TodoList:" + j + " is " + T.todoList.get(j));
		}
		T.removeItem(0);
		T.updateItem(0, "1 to 1");
		T.searchItem("1 to 1");

		for (int i = 0; i < T.todoList.size(); i++) {
			System.out.println("Your TodoList:" + i + " is " + T.todoList.get(i));
		}

	}

}
