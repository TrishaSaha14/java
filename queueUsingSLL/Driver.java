package queueUsingSLL;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to enqueue. \nEnter 2 to display. \nEnter 3 to dequeue. \nEnter 4 to peek. \nEnter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data: ");
				int data = sc.nextInt();
				queue.enqueue(data);
				break;
			case 2:
				queue.display();
				break;
			case 3:
				queue.dequeue();
				break;
			case 4:
				queue.peek();
				break;
			case 5:
				flag = false;
				break;
			}
		}
//		Queue q = new Queue();
//		q.enqueue(10);
//		q.peek();
//		q.display();
//		q.enqueue(20);
//		q.display();
//		q.dequeue();
//		q.peek();
//		q.display();
//		q.dequeue();
//		q.peek();
//		q.display();
//		q.dequeue();
//		q.peek();
	}
}
