package ro.ase.acs.cts.classes;

import java.util.ArrayList;
import java.util.List;

import ro.ase.acs.cts.interfaces.Storable;
import ro.ase.acs.cts.interfaces.Storage;

public class HybridStorage implements Storage {
	private List<Storable> content = new ArrayList<>();

	@Override
	public void save(Storable storable) {
		content.add(storable);
	}

	@Override
	public List<Storable> getContent() {
		return content;
	}

}
