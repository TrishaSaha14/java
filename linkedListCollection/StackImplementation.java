package linkedListCollection;
import java.util.*;
public class StackImplementation {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		
		Stack st = new Stack();
		st.add(10);
		st.add(20);
		st.add(30);
		
		System.out.println(st);
		
		System.out.println(s.search(10));
		System.out.println(s.search(30));

		System.out.println(st.search(10)); 
		System.out.println(st.search(30));
		

		System.out.println(s.get(0));
		System.out.println(st.get(0));
	}
}
