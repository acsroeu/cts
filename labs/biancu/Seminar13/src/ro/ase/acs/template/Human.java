package ro.ase.acs.template;

public class Human extends PartsMover {

	@Override
	public void liftPart() {
		System.out.println("The light is green, you can lift the part");
	}

	@Override
	public void transportPart() {
		System.out.println("Transport the part on the dedicated path");
	}

	@Override
	public void dropPart() {
		System.out.println("The light is green you can drop the part");
	}

}
