package ro.ase.acs.cts.classes;

import java.util.ArrayList;
import java.util.List;

//a folder cannot be the substitute of a file
//LSP is broken here
public class Folder extends File {
	private List<File> files = new ArrayList<>();
	
	public Folder(String name) {
		super(name);
	}
	public void addFile(File file) {
		files.add(file);
	}
}
