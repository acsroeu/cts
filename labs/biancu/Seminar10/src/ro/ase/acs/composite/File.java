package ro.ase.acs.composite;

import java.util.Collection;

import ro.ase.acs.main.ProgMain;

public class File implements DiskElement {
	private String name;
	
	public File(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(ProgMain.padding + name);
	}

	@Override
	public void addElement(DiskElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteElement(DiskElement element) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public Collection<DiskElement> getElements() {
		throw new UnsupportedOperationException();
	}

}
