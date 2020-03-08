package ro.ase.acs.cts.classes;

public class File {
	private String name;
	private float dimension;
	//is the storage type the job of a file???
	public enum StorageType { hdd, ssd, hybrid };
	private StorageType storageLocation;

	public File(String name) {
		this.name = name;
	}
	
	public StorageType getStorageLocation() {
		return storageLocation;
	}

	//should I say for every file the storage location?
	//SRP principle is broken here
	public void setStorageLocation(StorageType storageLocation) {
		this.storageLocation = storageLocation;
	}

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
