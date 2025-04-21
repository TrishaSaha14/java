package queue_collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(45);
		pq.add(80);
		pq.add(10);
		pq.add(50);				//heterogeneous datacannot be added gives classCast exception
		
		System.out.println(pq);  //By default min heap hence min element is printed at first then other elements are self balanced
		
		System.out.println(pq.offer(10));
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove(45));
		System.out.println(pq.size());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
