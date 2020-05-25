package ro.ase.acs.template;

public abstract class PartsMover {
	public final void move() {
		liftPart();
		transportPart();
		dropPart();
	}
	
	public abstract void liftPart();
	public abstract void transportPart();
	public abstract void dropPart();
}
