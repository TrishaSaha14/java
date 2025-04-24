package junitpractice1;

import java.util.Collections;
import java.util.List;

public class TestUtils {
	public int add(int x , int y) {
		return x+y;
	}
	
	public List returnList(List list) {
		return list;
	}
	
	public List<Integer> sortedList(List<Integer> list){
		return list.stream().sorted().toList();
	}
	
	public int div(int x,int y) throws ArithmeticException{
		if(y!=0) {
			return x/y;
		}
		else {
			throw new ArithmeticException("The denominator is zero");
		}
	}
	
	public String returnString(String s) {
		if(s.startsWith("H")) {
			return s;
		}
		else {
			return null;
		}
	}
	
	public List<Integer> checkSameListAfterModifying(List list){
		Collections.sort(list);
		return list;
	}
	
	public List<String> checkMatchers(List<String> list){
		return list.stream().map(String::toUpperCase).toList();
	}
}
