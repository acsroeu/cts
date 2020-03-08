package ro.ase.acs.cts.interfaces;

import java.util.List;

public interface Storage {
	public void save(Storable storable);
	public List<Storable> getContent();
}
