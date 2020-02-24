package ro.ase.acs.main;

import ro.ase.acs.cts.Caine;
import ro.ase.acs.cts.Caine.Rasa;
import ro.ase.acs.cts.Mamifer;

public class Main {

	public static void main(String[] args) {
		Caine c;
		c = new Caine(Rasa.pug, 3);
		System.out.println(c.getVarsta());
		
		Mamifer m = c;
		m.naste();
	}

}
