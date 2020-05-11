package ro.ase.acs.builder;

public interface AbstractApartmentBuilder {
	public void setSurface(float surface);
	public void setNbOfRooms(int nbOfRooms);
	public void setFloor(int floor);
	
	public Apartment getResult();
}
