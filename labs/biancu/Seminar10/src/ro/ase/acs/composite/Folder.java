package ro.ase.acs.composite;

import java.util.ArrayList;
import java.util.Collection;

import ro.ase.acs.main.ProgMain;

public class Folder implements DiskElement {
	private String name;
	private Collection<DiskElement> elements = 
			new ArrayList<DiskElement>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println(ProgMain.padding + name);
		ProgMain.padding += "   ";
		for(DiskElement e : elements) {
			e.print();
		}
		ProgMain.padding = ProgMain.padding.substring(0, 
				ProgMain.padding.length() - 3);
	}

	@Override
	public void addElement(DiskElement element) {
		elements.add(element);
	}

	@Override
	public void deleteElement(DiskElement element) {
		elements.remove(element);
	}

	@Override
	public Collection<DiskElement> getElements() {
		return elements;
	}

}
