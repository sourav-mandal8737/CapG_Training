package Testing_TestUtils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
//import static org.junit.Assert.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
//import org.junit.Ignore;
import org.junit.Test;

import Practice.TestUtil;

public class TestClass {

	TestUtil utils;
	//Scanner scan;

	/*	
	@Before
	public void setup() {
		utils = new TestUtil();
		System.out.println("hello");
	}

	@Test
	public void assertEqualsAddition() {
		//TestUtil utils = new TestUtil();
		int result = utils.add(10, 5);
		assertEquals(15, result);
		//assertNotEquals(13,result);
	}

	//@Test
	@Ignore
	public void assertCheck() {
		TestUtil utils = new TestUtil();
		List<Integer> data = Arrays.asList(1, 2, 3, 4);
		List list = utils.returnList(data);
		for (Object o : list) {
			//assertTrue(o instanceof Integer);
			Integer i = (Integer) o;
			assertTrue(i % 2 == 0);
		}
	}

	@After
	public void closeResource() {
		System.out.println("hi");
		this.utils = null;
	}
	*/

	@Before
	public void setup() {
		utils = new TestUtil();
		//scan = new Scanner(System.in);
	}

	@After
	public void closeResource() {
		this.utils = null;
		//scan.close();
	}

	@Test
	public void checkSorted() {
		List<Integer> input = Arrays.asList(5, 4, 8, 6, 1);
		List<Integer> expected = Arrays.asList(1, 4, 5, 6, 8);
		List<Integer> actual = utils.sortList(input);
		assertEquals(expected, actual);
	}

	@Test
	public void checkSortedList() {
		List<Integer> actual = Arrays.asList(5, 4, 8, 6, 1);
		List<Integer> expected = Arrays.asList(5, 4, 8, 6, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void assertEqualAddition() {
		// Removed user input for automated testing
		int x = 7;
		int y = 3;
		int result = utils.add(x, y);
		assertEquals(x + y, result);
	}

	@Test
	public void checkEqualArray() {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 2, 3, 4, 5};
		assertArrayEquals(arr1, arr2);
	}

	@Test
	public void checkException() {
		assertThrows(ArithmeticException.class, () -> {
			utils.div(10, 0);
		});
	}

	@Test
	public void checkNull() {
		assertNull(utils.returnString("Demo")); // "Demo" doesn't start with "H", should return null
	}

	@Test
	public void checkNotNull() {
		assertNotNull(utils.returnString("Hello"));
	}

	@Test
	public void checkSame() {
		List<Integer> input = Arrays.asList(5, 8, 3, 4, 2, 9);
		List<Integer> output = utils.checkSameListAfterModifying(input);
		assertSame(output, input);
	}

	@Test
	public void checkNotSame() {
		List<Integer> input = Arrays.asList(5, 8, 3, 4, 2, 9);
		List<Integer> output = new ArrayList<>(utils.checkSameListAfterModifying(input));
		assertNotSame(output, input);
	}

	@Test
	public void checkMatchersInList() {
		List<String> input = Arrays.asList("tom", "jerry", "spike");
		List<String> output = utils.checkMatchers(input);

		assertThat(output, hasItem("TOM"));
		assertThat(output, hasItems("TOM", "JERRY", "SPIKE"));
	}
}
