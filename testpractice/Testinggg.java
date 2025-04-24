package testpractice;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junitpractice1.TestUtils;

public class Testinggg {
	
	TestUtils utils;
	Scanner sc;
	
	@Before
	public void setup() {
		utils=new TestUtils();
		sc=new Scanner(System.in);
		System.out.println("Hi");
	}
	
	@Test
	public void assertEqualsAddition() {  //comment the scanner
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();
		int result = utils.add(x, y);
		assertEquals(x+y,result);
		assertNotEquals(18,result);
		}
	
	@Test
	public void assertCheckSort() {
		List<Integer> input = Arrays.asList(5,1,6,8,4);
		List<Integer> expected = Arrays.asList(1,4,5,6,8);
		List<Integer> actual = utils.sortedList(input);
		assertEquals(expected,actual);
	}
	
//	@Test
	@Ignore
	public void assertCheck() {
		TestUtils utils = new TestUtils();
		List<Integer> data = Arrays.asList(1,2,3,4);
		List list = utils.returnList(data);
		for(Object o:list) {
			//assertTrue(o instanceof Integer);
			Integer i = (Integer)o;
			assertTrue(i%2==0);
		}
	}
	
	@After
	public void resourceClose() {
		System.out.println("Hello");
		this.utils=null;
	}
	
	@Test
	public void checkEqualArray(){
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		assertArrayEquals(arr1,arr2);
	}
	
	@Test
	public void checkException() {
		assertThrows(ArithmeticException.class,()->{
			utils.div(10, 0);
		});
	}
	
	
	@Test
	public void checkNull() {
		assertNull(utils.returnString("Demo"));
	}
	
	@Test
	public void checknotNull() {
		assertNotNull(utils.returnString("Hello"));
	}
	
	@Test
	public void checkSame() {
		List<Integer> input = Arrays.asList(5,8,3,4,2,9);
		List<Integer> output = utils.checkSameListAfterModifying(input);
		assertSame(output,input);
	}
	
	@Test
	public void checkNotSame() {
		List<Integer> input = Arrays.asList(5,8,3,4,2,9);
		List<Integer> output = (new ArrayList(utils.checkSameListAfterModifying(input)));
		assertNotSame(output,input);
	}

	@Test
	public void checkMatcherInlist() {
		List<String> input = Arrays.asList("tom","jerry","spike");
		List<String> output = utils.checkMatchers(input);
		assertThat(output,hasItem("TOM"));
		assertThat(output,hasItems("TOM","JERRY","SPIKE"));
	}
}
