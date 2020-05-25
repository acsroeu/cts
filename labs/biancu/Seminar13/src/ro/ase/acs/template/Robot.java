package ro.ase.acs.template;

public class Robot extends PartsMover {

	@Override
	public void liftPart() {
		System.out.println("The robotic arm is lifting the part");
	}

	@Override
	public void transportPart() {
		System.out.println("Moving robot from point x1, y1 to point x2, y2");
	}

	@Override
	public void dropPart() {
		System.out.println("The robotic arm is dropping the part");
		
	}

}
