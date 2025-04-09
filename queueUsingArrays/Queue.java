package queueUsingArrays;

public class Queue {
	int size;
	int front = -1;
	int rear = -1;
	int[] arr;
	
	public Queue(int size) {
		this.size=size;
		this.arr = new int[size];
	}
	
	public void enqueue(int data) {
		if(isEmpty()) {
			this.rear++;
			this.arr[this.rear]=data;
			this.front++;
			return;
		}
		if(isFull()) {
			System.out.println("Queue overflow");
			return;
		}
		
		this.rear++;
		this.arr[this.rear]=data;
		return;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("No data to display");
			return;
		}
		if(front == rear+1) {
			System.out.println("No data to display");
			return;
		}
		int count=this.front;
		while(count != (this.rear+1)) {
			//count++;
			System.out.print(this.arr[count]+" ");
			count++;
		}
		System.out.println();
		
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue underflow");
			return;
		}
		if(this.front==(this.rear+1)) {
			System.out.println("Out of bound");
			return;
		}
//		System.out.println(this.arr[this.front]+" is dequeued");
//		this.front++;
		for(int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue underflow");
			return;
		}
		if(this.front==(this.rear+1)) {
			System.out.println("Out of bound");
			return;
		}
		System.out.println(this.arr[this.front]+" is peeked");
	}
	public boolean isFull() {
		if((this.rear+1) == this.arr.length) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(this.front == -1 && this.rear == -1) {
			return true;
		}
		return false;
	}
}
