package ro.ase.acs.tests.cases;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.acs.classes.Computer;
import ro.ase.acs.classes.Sum;
import ro.ase.acs.interfaces.Operation;
import ro.ase.acs.interfaces.Reader;
import ro.ase.acs.interfaces.Writer;
import ro.ase.acs.tests.categories.Mandatory;

public class ComputerTests {
	private static String output = "";
	
	//Stub
	class ReaderStub implements Reader {
		@Override
		public List<Integer> read() {
			List<Integer> list = new Vector<Integer>();
			list.add(5);
			list.add(7);
			list.add(3);
			return list;
		}	
	}
	
	//Fake
	class WriterFake implements Writer {
		private double value = 0;
		
		@Override
		public void write(double d) {
			value = d;
		}
		
		public double getValue() {
			return value;
		}
	}
	
	//Stub
	class ConsoleWriterStub implements Writer {
		@Override
		public void write(double d) {
			output = "15.00";
		}
	}

	@Test
	@Category(Mandatory.class)
	public void testCorrect() {
		WriterFake writer = new WriterFake();
		Computer computer = 
				new Computer(new ReaderStub(), writer, new Sum());
		computer.applyOperation();
		assertEquals("The computer doesn't work correctly", 15, writer.getValue(), 0.01);
	}
	
	@Test
	public void testConformance() {
		Reader reader = new ReaderStub();
		Sum sum = new Sum();
		Computer computer = new Computer(reader, new ConsoleWriterStub(), sum);
		computer.applyOperation();
		double result = sum.compute(reader.read());
		String formattedResult = String.format("%.2f", result);
		assertEquals("The output is not in the correct format", formattedResult, output);
	}
	
	@Test
	public void testOrdering() {
		Reader reader = new ReaderStub();
		Computer computer = new Computer(reader, new WriterFake(), new Sum());
		computer.applyOperation();
		List<Integer> list = reader.read();
		Integer value1 = 5;
		Integer value2 = 7;
		Integer value3 = 3;
		assertEquals("The values are not ordered correctly", value1, list.get(0));
		assertEquals("The values are not ordered correctly", value2, list.get(1));
		assertEquals("The values are not ordered correctly", value3, list.get(2));
	}
	
	@Test(expected = InvalidParameterException.class)
	@Category(Mandatory.class)
	public void testExistence() {
		Computer computer = new Computer(null, null, null);
		computer.applyOperation();
	}
	
	//Example of Mockito (Mocking library)	
	@Test
	public void testRight() {
		List<Integer> list = Arrays.asList(5, 7, 4, 1);
		//mock creation
		Reader mockReader = mock(Reader.class);
		//mock implementation
		when(mockReader.read()).thenReturn(list);
		
		Operation mockOperation = mock(Operation.class);
		when(mockOperation.compute(list)).thenReturn(50d);
		
		Writer mockWriter = mock(Writer.class);
		
		Computer computer = new Computer(mockReader, 
				mockWriter, mockOperation);
		computer.applyOperation();
		
		//we verify if the method is called with
		//the desired parameter
		verify(mockWriter).write(50d);
	}
}
