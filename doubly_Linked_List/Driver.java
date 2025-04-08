package doubly_Linked_List;

import java.util.Scanner;



public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dlist = new DoublyLinkedList(); 
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1 to insert \nEnter 2 to display. \nEnter 3 to update \nEnter 4 to insert at a particular position \nEnter 5 to delete in any position \nEnter 6 to exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the data: ");
					int data = sc.nextInt();
					dlist.insert(data);
					break;
				case 2:
					dlist.display();
					break;
				case 3:
					System.out.println("Enter the position you want to update: ");
					int posi = sc.nextInt();
					System.out.println("Enter the new data you want to update at that position: ");
					int uptData = sc.nextInt();
					dlist.update(uptData, posi);
					break;
				case 4:
					System.out.println("Enter the position you want to insert: ");
					int pos = sc.nextInt();
					System.out.println("Enter the new data you want to insert at that position: ");
					int newdata = sc.nextInt();
					dlist.insertAtPos(newdata, pos);
					break;
				case 5:
					System.out.println("Enter the position you want to delete: ");
					int posit = sc.nextInt();
					dlist.delete(posit);
					break;
				case 6:
					flag = false;
					break;
				default:
			}
		}
	}
}
