package ro.ase.acs.cts;

public class Caine extends MamiferTerestru implements Mamifer {
	public enum Rasa { ciobanesc, labrador, pug, golden_retriever, husky };
	private Rasa rasa;
	
	public Caine(Rasa rasa, int varsta) {
		super(varsta);
		this.rasa = rasa;
	}
	
	@Override
	public void naste() {
		System.out.println("S-a nascut un pui din rasa " + rasa);
	}

	@Override
	public int deplasare() {
		return 10;
	}
	
}
