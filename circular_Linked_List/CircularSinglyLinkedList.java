package circular_Linked_List;

public class CircularSinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			tail.next=head;
			count++;
		}
		else {
			tail.next=node;
			tail=node;
			tail.next=head;
			count++;
		}
	}
	public void display() {
		
		if(head==null) {
			System.out.println("No data to display");
			return;
		}
		Node temp=head;
//		for(int i=0;i<count;i++) {
//			System.out.print(temp.data+"-->");
//			temp=temp.next;
//		}
		
		do {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println();;
	}
	
	public void insertAtPos(int newInsert,int pos) {
		Node node = new Node(newInsert);
		int num=2;
		
		if(head==null) {
			head=node;
			tail=node;
			tail.next=head;
			
			return;
		}
		else if(pos==1 && head.next!=null) {
			node.next=head;
			head=node;
			tail.next=head;
			
			return;
		}
		
		else {
			Node prev=head;
			Node temp=head.next;
			do {
				if(num==pos) {
					prev.next=node;
					node.next=temp;
					return;
				}
				prev=prev.next;
				temp=temp.next;
				num++;
			}while(temp.next!=head);
			
//			
			temp.next=node;
			tail=node;
			tail.next=head;
		}
	}
	
	public void update(int newData,int posi) {
//		Node node = new Node(newData);
		int num =1;
		if(head==null) {
			System.out.println("No data, hence cannot be updated");
		}
		
//		if(posi==1 && head.next==head) {
//			head=node;
//			tail=node;
//			tail.next=head;
//			return;
//		}
//		
//		else if(posi==1 && head.next!=head) {
//			node.next=head.next;
//			head=node;
//			return;
//		}
		 
		else {
			Node temp=head;
			
			do {
				if(num==posi) {
					temp.data=newData;
					return;
				}
				temp=temp.next;
				num++;
				
			}while(temp.next != head);
			
			if(posi>count) {
				System.out.println("Out of bound");
			}
			else {
				temp.data=newData;
			}
		}
	}
	
	public void delete(int posit) {
		Node prev = head;
		Node temp = head.next;
		int num=2;
		if(head==null) {
			System.out.println("No element to delete");
		}
		if(posit ==1 && head.next==head) {
			head=null;
			tail=null;
			return;
		}
		if(posit ==1 && head.next!=head) {
			head=head.next;
			tail.next=head;
			return;
		}
		
		do {
			
			if(num==posit) {
				prev.next=temp.next;
				temp.next=null;
				return;
			}
			prev=prev.next;
			temp=temp.next;
		}while(temp.next!=head);
		
			if(posit>count) {
				System.out.println("Out of bound");
			}
			else {
				prev.next=head;
				temp=null;
				tail=prev;
			}
			
		
	}
}
