package queueUsingSLL;

public class Queue {
	Node front;
	Node rear;
	
	public void enqueue(int data) {
		Node node = new Node(data);
		if(front == null && rear == null) {
			front = node;
			rear = node;
			return;
		}
		rear.next=node;
		rear=node;
		return;
	}
	
	public void display() {
		if(front == null && rear == null || front == null) {
			System.out.println("No data to display");
			return;
		}
		
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void dequeue() {
		if(front == null && rear == null || front == null) {
			System.out.println("No data to dequeue");
			return;
		}
		Node temp = front;
		System.out.println(temp.data+" is dequeued");
		front = front.next;
		temp.next=null;
		
		return;
	}
	
	public void peek() {
		if(front == null && rear == null || front == null) {
			System.out.println("No data to peek");
			return;
		}
		System.out.println(front.data+" is peeked");
	}
}
