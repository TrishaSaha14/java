package stackUsingArray;

public class Stack {
	int top = -1;
	int size;
	int[] arr;
	
	Stack(int size){
		this.size=size;
		this.arr = new int[size];
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full. Cannot push");
			
		}
		else {
			this.top++;
			this.arr[this.top]=data;
		}
		
	}
	
	public void display() {
		if(this.top==-1) {
			System.out.println("Stack is empty");
		}
		else {	
			int count = this.top;
			while(count!=-1) {
				System.out.print(arr[count]+" ");
				count--;
			}
			System.out.println();
		}
	}
	
	public void pop(){
			if(isEmpty()) {
				System.out.println("stack is empty");
				return;
			}
			System.out.println(this.arr[this.top]+"is popped");
			this.top--;

	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println(this.arr[this.top]+"is peek element");
	}
	public boolean isFull() {
		if(size==this.top) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(this.top==-1) {
			//System.out.println("stack is empty");
			return true;
		}
		return false;
	}
}
