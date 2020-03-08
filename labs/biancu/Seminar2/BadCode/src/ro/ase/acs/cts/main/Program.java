package ro.ase.acs.cts.main;


import ro.ase.acs.cts.classes.File;
import ro.ase.acs.cts.classes.File.StorageType;
import ro.ase.acs.cts.classes.Folder;
import ro.ase.acs.cts.classes.Storage;
class Tip
{
	public int value;
}

public class Program {
	
	public static long add(Tip x, Tip y) {
		int v = x.value;
		x = new Tip();
		x.value = v;
		x.value = x.value + y.value;
		return x.value;
	}

	public static void main(String[] args) {
		File file1 = new File("abc.txt");
		file1.setStorageLocation(StorageType.hdd);
		File file2 = new File("bcd.txt");
		file2.setStorageLocation(StorageType.ssd);
		File file3 = new File("xyz.txt");
		file3.setStorageLocation(StorageType.hybrid);
		
		Folder folder1 = new Folder("TextFiles");
		folder1.addFile(file2);
		folder1.addFile(file3);
		
		Storage storage = new Storage();
		storage.save(file1);
		storage.save(folder1);
		
		storage.displayContent();
		
		Tip x = new Tip();
		Tip y = new Tip();
		x.value = 3;
		y.value = 5;
		add(x, y);
		System.out.println(x.value);
	}

}
