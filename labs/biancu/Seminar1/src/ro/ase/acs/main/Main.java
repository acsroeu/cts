package ro.ase.acs.main;

import ro.ase.acs.cts.Impozabil;
import ro.ase.acs.cts.Masina;
import ro.ase.acs.cts.Masina.TipCombustibil;

public class Main {

	public static void main(String[] args) {
		Masina m1 = new Masina("Dacia Logan", 100, 1600);
		m1.setCombustibil(TipCombustibil.benzina);
		System.out.println(m1.calculeazaImpozit());
		
		Impozabil x;
		x = m1;
		x.calculeazaImpozit();
	}

}
