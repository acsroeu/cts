package ro.ase.acs.classes;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import ro.ase.acs.interfaces.Reader;

public class ConsoleReader implements Reader, Closeable {
	
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public List<Integer> read() {
		List<Integer> list = new Vector<>();
		int i = 0;
		while(i != -1) {
			i = scanner.nextInt();
			if(i!=-1) {
				list.add(i);
			}
		}
		return list;
	}

	@Override
	public void close() throws IOException {
		scanner.close();
	}
	
}
