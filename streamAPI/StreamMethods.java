package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(20);
		arr.add(40);
		arr.add(30);
		arr.add(50);
		System.out.println(arr);
		
		Stream s=arr.stream();
		Stream s1 = s.distinct();
		s1.forEach(n->System.out.println(n));
//		System.out.println(arr);  //remain unchanged
		
		arr.stream().distinct().forEach(n->System.out.println(n));  //pipeline
		
		Optional<Integer> optional = arr.stream().distinct().min((o1,o2)->o1-o2);
		if(optional.isPresent()) {
			System.out.println(optional.get()); //prints minimum element
		}
		
		Integer i= arr.stream().max((o1,o2)->o1-o2).get();
		System.out.println(i);  //prints maximum element
		
		arr.stream().sorted().forEach(n->System.out.print(n+" "));
		System.out.println();
		arr.stream().sorted((o1,o2)->o2-o1).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		arr.stream().distinct().sorted().map(n->n*n).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		arr.stream().distinct().filter(n->(n%2==0)).forEach(n->System.out.print(n+" "));
		
		List<Integer> li = arr.stream().distinct().filter(n->(n%2==0)).toList();
		System.out.println(li);
		
		Stream s5 = Stream.of(1,4,7,"hello");
		s5.forEach(n->System.out.print(n+" "));
		
		Optional<Integer> op = arr.stream().findFirst();
		System.out.println(op.get());
		
		System.out.println(arr.stream().findAny().get());
		
		System.out.println(arr.stream().count());
		
		List<String> s6 = Arrays.asList("hello","demo","hi");
		Stream s8 = s6.stream();
		
		List<Integer> s7 = Arrays.asList(1,2,3);
		Stream s9 = s7.stream();
		
		Stream.concat(s8, s9).forEach(n->System.out.print(n+" "));
		
		System.out.println(arr.stream().distinct().allMatch(n->n%2==0));
		System.out.println(arr.stream().distinct().anyMatch(n->n%2==0));
		
	}
}
