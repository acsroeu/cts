package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.DisplayService;
import ro.ase.acs.cts.classes.File;
import ro.ase.acs.cts.classes.Folder;
import ro.ase.acs.cts.classes.HddStorage;
import ro.ase.acs.cts.classes.SsdStorage;
import ro.ase.acs.cts.interfaces.Storage;

public class Program {

	public static void main(String[] args) {
		File file1 = new File("abc.txt");
		File file2 = new File("bcd.txt");
		File file3 = new File("xyz.txt");
		
		Folder folder1 = new Folder("TextFiles");
		folder1.addStorable(file2);
		folder1.addStorable(file3);
		
		Folder folder2 = new Folder("Folder");
		File file4 = file1.copy();
		File file5 = file2.copy();
		folder2.addStorable(file4);
		folder2.addStorable(file5);
		folder1.addStorable(folder2);
		
		Storage hddStorage = new HddStorage();
		hddStorage.save(file1);

		Storage ssdStorage = new SsdStorage();
		ssdStorage.save(folder1);
		
		DisplayService displayService = new DisplayService();
		System.out.println("HDD: ");
		displayService.display(hddStorage);
		System.out.println("SSD: ");
		displayService.display(ssdStorage);
	}

}
