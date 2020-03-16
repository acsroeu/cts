package ro.ase.acs.cts.classes;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.cts.classes.File.StorageType;

public class Storage {
	//OCP principle is broken here
	//Every time a new storage type will be used
	//The class will be changed
	private List<File> hddFiles = new ArrayList<>();
	private List<File> ssdFiles = new ArrayList<>();
	private List<File> hybridFiles = new ArrayList<>();
	
	public void save(File file) {
		if(file.getStorageLocation() == StorageType.hdd) {
			hddFiles.add(file);
		}
		else if (file.getStorageLocation() == StorageType.ssd) {
			ssdFiles.add(file);
		}
		else {
			hybridFiles.add(file);
		}
	}
	
	//SRP principle is broken here too
	//It's not the job of the Storage to do the display
	//Why changing the class if I want to display the content differently
	public void displayContent() {
		System.out.println("HDD: ");
		for(File f : hddFiles) {
			System.out.println("  - " + f.getName() + 
					" " + f.getDimension() + " KB");
		}
		
		System.out.println("SSD: ");
		for(File f : ssdFiles) {
			System.out.println("  - " + f.getName() + 
					" " + f.getDimension() + " KB");
		}
		
		System.out.println("Hybrid storage: ");
		for(File f : hybridFiles) {
			System.out.println("  - " + f.getName() + 
					" " + f.getDimension() + " KB");
		}
	}
}
