package Singly_Linked_List;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			count++;
		}
		else {
			tail.next=node;
			tail=node;
			count++;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("No data to display");
			System.out.println();
		}
		else {
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+"-->");
				temp =temp.next;
			}
			System.out.println();
		}
		
		
	}
	
	public void update(int pos,int newData) {
		Node temp = head;
		int num=1;
		if(temp==null) {
			System.out.println("No data to update");
		}
		else{
			while(temp!=null) {
				if(num==pos) {
					temp.data=newData;
					System.out.println("Data updated");
				}
				temp=temp.next;
				num++;
			}
			if(pos>=num) {
				System.out.println("Cannot update in that position as no data is present their");
			}
		}
		
			
	}
	
	public void insertAtPos(int posi,int newInsert) {
		Node prev = head;
		Node temp=head.next;
		int num = 2;
		Node node = new Node(newInsert);
		if(head==null) {
			
			head=node;
			tail=node;
			num++;
		}
		else if(posi==1) {
			node.next=prev;
			head=node;
			num++;
		}
		else {
			while(temp != null && prev.next != null) {
			
			
				if(num==posi) {
					node.next=temp;
					prev.next=node;
				
					return;
				}
				prev=prev.next;
				temp=temp.next;
				num++;
			}
			if(posi>num) {
				System.out.println("Cannot insert as it is out of bound");
			}
			else {
				prev.next=node;
				temp=node;
				node.next=null;
				tail=node;
				num++;
			}
		
		}
		
		
	}
	
	public void delete(int pos) {
		Node temp = head;
		int num=2;
		if(head==null) {
			System.out.println("No element to delete");
			
		}
		else if(temp.next == null && pos == 1) {
			head=null;
			tail=null;
		}
		
		else if(temp.next != null && pos==1) {
			head=temp.next;
			temp=null;
		}
		else {
			while(temp.next.next != null) {
				if(pos==num) {
					temp.next=temp.next.next;
					temp.next.next=null;
					return;
				}
				temp=temp.next;
				num++;
			}
			if(pos>num) {
				System.out.println("Out of bound, hence cannot be deleted");
			}
			else {
				temp.next=null;
				tail=temp;
			}
		}
	}
}
