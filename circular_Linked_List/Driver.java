package circular_Linked_List;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		CircularSinglyLinkedList clist = new CircularSinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert \nEnter 2 to display. \nEnter 3 to update \nEnter 4 to insert at a particular position \nEnter 5 to delete in any position \nEnter 6 to exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the data you want to insert:");
					int data = sc.nextInt();
					clist.insert(data);
					break;
				case 2:
					clist.display();
					break;
				case 3:
					System.out.println("Enter the data you want to update:");
					int newData = sc.nextInt();
					System.out.println("Enter the position where  to update:");
					int posi = sc.nextInt();
					clist.update(newData, posi);
					break;
				case 4:
					System.out.println("Enter the data you want to insert:");
					int newInsert = sc.nextInt();
					System.out.println("Enter the position where  to insert:");
					int pos = sc.nextInt();
					clist.insertAtPos(newInsert, pos);
					break;
				case 5:
					System.out.println("Enter the position where  to delete:");
					int posit = sc.nextInt();
					clist.delete(posit);
					break;
				case 6:
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}
