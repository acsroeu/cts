package ro.ase.acs.cts;

public abstract class MamiferTerestru {
	private int varsta;
	
	public MamiferTerestru(int varsta) {
		this.varsta = varsta;
	}
	
	public abstract int deplasare();
	
	public int getVarsta() {
		return varsta;
	}
}
