package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.classes.File;
import ro.ase.acs.cts.interfaces.Storable;

public class File implements Storable {
	private String name;
	private float dimension;

	public File(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDimension() {
		return dimension;
	}

	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	
	public File copy() {
		File copy = new File(name + "_copy");
		copy.dimension = dimension;
		return copy;
	}
}
