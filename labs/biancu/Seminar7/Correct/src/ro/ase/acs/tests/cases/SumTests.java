package ro.ase.acs.tests.cases;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import ro.ase.acs.classes.Sum;


//Test according to the Right BICEP
public class SumTests {	
	//AAA -> Arrange, Act, Assert
	
	private Integer[] values = new Integer[] {3000, 5000, 2, -7, 400, 0 };
	private Sum sum;
	private List<Integer> list;
	
	//this method is executed before each unit test
	@Before
	public void setUp() {
		sum = new Sum();
		list = new Vector<>();
	}

	//Right and performance test
	@Test(timeout = 10)
	public void testSumRight() {
		list.add(4);
		list.add(5);
		list.add(-1);
		double result = sum.compute(list);
		assertEquals("The sum is not correctly computed", 8, result, 0.01);
	}
	
	//we test that the method throws an exception
	@Test(expected = InvalidParameterException.class)
	public void testMaxBoundary() {
		list.add(3_000_000);
		list.add(3_000_000);
		sum.compute(list);
	}
	
	@Test
	public void testEmptyList() {
		double result = sum.compute(list);
		assertEquals("The sum should be 0 for an empty list", 
				0, result, 0.01);
	}
	
	@Test
	public void testSingleElementList() {
		list.add(7000);
		double result = sum.compute(list);
		assertEquals("The sum is not correctly computed",
				7000, result, 0.01);
	}
	
	@Test
	public void testNullList() {
		list = null;
		Double result = sum.compute(list);
		assertNull("The result should be null for a null list", result);
	}
	
	@Test
	public void testInverse() {
		list = Arrays.asList(values);
		Double result = sum.compute(list);
		for(int i = 0; i < values.length; i++) {
			result -= values[i];
		}
		assertEquals("The sum in not correctly computed",
				0, result, 0.01);
	}
	
	@Test
	public void testCrossCheck() {
		list = Arrays.asList(values);
		Integer streamResult = 
				list.stream().collect(Collectors.summingInt(Integer::intValue));
		Double ourResult = sum.compute(list);
		assertEquals("The sum is not correctly computed", 
				streamResult, ourResult, 0.01);
	}
}
