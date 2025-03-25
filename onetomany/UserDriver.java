package onetomany;

import java.util.Scanner;

public class UserDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		
		User user = new User(size,"Trisha");
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Enter 1 for adding post:\nEnter 2 for displaying posts\nEnter 3 to update\nEnter 4 to remove the post\nEnter 5 to exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter post name: ");
					String posName = sc.nextLine();
					System.out.println("Enter post id: ");
					int pid = sc.nextInt();
					Post p2 = new Post(pid,posName);
					user.addPost(p2);
					break;
				case 2:
					user.displayPost();
					break;
				case 3:
					System.out.println("Enter oldpost id: ");
					int oldpid = sc.nextInt();
					System.out.println("Enter newpost id: ");
					int newpid = sc.nextInt();
					user.update(oldpid,newpid);
					System.out.println("Post updated");
					break;
				case 4:
					System.out.println("Enter post id to be removed: ");
					int rempid = sc.nextInt();
					user.remove(rempid);
					System.out.println("Post removed successfully");
					break;
				case 5:
					flag = false;
					break;
			}
			
		}
	
	}
}
