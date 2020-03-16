package ro.ase.acs.cts.classes;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.cts.interfaces.Storable;

public class Folder implements Storable {
	private String name;
	
	private List<Storable> content = new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(":");
		sb.append(System.lineSeparator());
		for(Storable s : content) {
			sb.append("    ");
			sb.append(s.getName());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStorable(Storable storable) {
		content.add(storable);
	}
}
