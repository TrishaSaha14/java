package stackUsingSLL;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to push. \nEnter 2 to display. \nEnter 3 to pop. \nEnter 4 to peek. \nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data: ");
				int data = sc.nextInt();
				stack.push(data);
				break;
			case 2:
				stack.display();
				break;
			case 3:
				stack.pop();
				break;
			case 4:
				stack.peek();
				break;
			case 5:
				flag = false;
				break;
			}
		}
	}
}
