package ro.ase.acs.builder;

//orchestreaza crearea de obiecte
public class ApartmentDirector {
	private AbstractApartmentBuilder builder;
	
	public ApartmentDirector(AbstractApartmentBuilder builder) {
		this.builder = builder;
	}
	
	public Apartment construct(float surface, int nbOfRooms, int floor) {
		builder.setSurface(surface);
		builder.setNbOfRooms(nbOfRooms);
		builder.setFloor(floor);
		return builder.getResult();
	}
}
