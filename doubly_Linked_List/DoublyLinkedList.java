package doubly_Linked_List;

public class DoublyLinkedList {
	Node head;
	Node tail;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			count++;
			return;
		}
		
//		else if(head.next==null) {
//			head.next=node;
//			node.prev=head;
//			tail=node;
//			count++;
//			return;
//		}
//		
		else {
			
				tail.next=node;
				node.prev=tail;
				tail=node;
				count++;
				return;
		}
	}
	
	public void display() {
		Node temp = head;
		Node temp1=tail;
		if(head==null && tail==null) {
			System.out.println("No data present");
		}
		for(int i=0;i<count;i++) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
		
		for(int i=0;i<count;i++) {
			System.out.print(temp1.data+"-->");
			temp1=temp1.prev;
		}
		System.out.println();
	}
	
	public void insertAtPos(int newData, int pos) {
		Node node = new Node(newData);
		int num = 2;
		if(head==null) {
			head=node;
			tail=node;
			count++;
			return;
		}
		
		else if(pos==1) {
			node.next=head;
			head.prev=node;
			head=node;
			count++;
			return;
		}

		
		else {
			Node temp=head;
			while(temp.next!=null) {
				if(num==pos) {
					node.next=temp.next;
					temp.next.prev=node;
					node.prev=temp;
					temp.next=node;
					count++;
					return;
				}
				temp=temp.next;
				num++;
			}
			temp.next=node;
			node.prev=temp;
			tail=node;
			count++;
			return;
			
		}
	}
	
	public void update(int uptData,int posi) {
		if(head==null) {
			System.out.println("No data to update");
			return;
		}
		int num=1;
		Node temp=head;
		while(temp!=null) {
			if(num==posi) {
				temp.data=uptData;
				return;
			}
			temp=temp.next;
			num++;
		}
		
		if(posi>=count) {
			System.out.println("Out of bound");
			return;
		}
		
	}
	
	public void delete(int posit) {
		
		int num=2;
		if(head==null) {
			System.out.println("No data to delete");
			return;
		}
		
		else if(posit==1 && head.next==null) {
			head=null;
			tail=null;
			count--;
			return;
		}

		else if(posit==1 && head.next!=null) {
			head=head.next;
			head.prev=null;
			count--;
			return;
		}
		
		else {
			Node previ = head;
			Node temp=head.next;
			while(temp.next!=null) {
				if(num==posit) {
					previ.next=temp.next;
					temp.next.prev=previ;
					temp.next=null;
					temp.prev=null;
					count--;
					return;
				}
				temp=temp.next;
				num++;
			}
			tail=tail.prev;
			tail.next=null;			
			count--;
			return;
		}
	}
}
