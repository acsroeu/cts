package ro.ase.acs.cts;

public class Masina extends Vehicul implements Impozabil {
	public enum TipCombustibil { benzina, motorina, electric };
	
	private int capacitateCilindrica;
	private TipCombustibil combustibil;
	
	public Masina(String denumire, int viteza, int capacitateCilindrica)
	{
		super(denumire, viteza);
		this.capacitateCilindrica = capacitateCilindrica;
	}
	
	
	public TipCombustibil getCombustibil() {
		return combustibil;
	}

	public void setCombustibil(TipCombustibil combustibil) {
		this.combustibil = combustibil;
	}

	@Override
	public float calculeazaImpozit() {
		if(capacitateCilindrica < 2000)
		{
			return (float)capacitateCilindrica / 1000 * 50;
		}
		else
		{
			return (float)capacitateCilindrica / 1000 * 100;
		}
	}

	@Override
	public void deplasare() {
		System.out.println("Masina se deplaseaza");
	}
	
}
