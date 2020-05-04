package ro.ase.acs.composite;

import java.util.Collection;

public interface DiskElement {
	public void print();
	public void addElement(DiskElement element);
	public void deleteElement(DiskElement element);
	public Collection<DiskElement> getElements();
}
