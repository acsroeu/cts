package ro.ase.acs.flyweight;

public class FlyweightApartment implements Renderable {
	//camp facultativ, adaugat doar pentru a vedea
	//cate obiecte sunt create efectiv
	public static int nbOfObjects = 0;
	private ApartmentType apartmentType;
	
	public FlyweightApartment(ApartmentType apartmentType) {
		this.apartmentType = apartmentType;
		nbOfObjects++;
	}

	@Override
	public void render() {
		if(apartmentType == ApartmentType.TwoRooms) {
			System.out.print("[ ] [ ]   ");
		}
		else if(apartmentType == ApartmentType.ThreeRooms) {
			System.out.print("[ ] [ ] [ ]   ");
		}
	}
}
