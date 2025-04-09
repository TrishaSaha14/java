package stackUsingSLL;

public class Stack {
	Node top;
	
	public void push(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			top = node;
			return;
		}
		node.next=top;
		top=node;
		return;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("No data to display");
			return;
		}
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println(top.data+" is popped");
		top=top.next;
		return;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(top.data+" is peek element");
	}
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
}
