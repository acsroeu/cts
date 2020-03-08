package ro.ase.acs.cts.classes;

import java.util.List;

import ro.ase.acs.cts.interfaces.Storable;
import ro.ase.acs.cts.interfaces.Storage;

public class DisplayService {
	//if we want we can go further and inherit
	//Storage from a Displayable interface
	public void display(Storage storage) {
		List<Storable> content = storage.getContent();
		
		for(Storable s : content) {
			System.out.println(String.format("%s", s.getName()));
		}
	}
}
