package ro.ase.acs.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.composite.File;
import ro.ase.acs.composite.Folder;
import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.CarWithAlarm;
import ro.ase.acs.decorator.DaciaLogan;

public class ProgMain {
	public static String padding = "";
	
	public static void main(String[] args) {
		//Decorator
		
		List<Car> cars = new ArrayList<>();
		cars.add(new DaciaLogan());
		CarWithAlarm car = new CarWithAlarm(new DaciaLogan());
		car.activateAlarm();
		System.out.println(car.getAlarmStatus());
		cars.add(car);
		
		for(Car c :  cars) {
			c.start();
		}
		
		System.out.println(car.getAlarmStatus());
		
		//Composite
		Folder folder4 = new Folder("Folder4");
		File file2 = new File("file2.txt");
		File file3 = new File("file3.txt");
		
		Folder folder3 = new Folder("Folder3");
		folder3.addElement(folder4);
		folder3.addElement(file2);
		folder3.addElement(file3);
		
		Folder folder2 = new Folder("Folder2");
		File file1 = new File("file1.txt");
		
		Folder folder1 = new Folder("Folder1");
		folder1.addElement(folder2);
		folder1.addElement(folder3);
		folder1.addElement(file1);
		
		folder1.print();
		
		folder1.deleteElement(file1);
		
		System.out.println();
		folder1.print();
	}

}
