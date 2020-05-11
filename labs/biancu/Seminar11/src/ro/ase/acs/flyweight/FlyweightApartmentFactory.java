package ro.ase.acs.flyweight;

import java.util.HashMap;

public class FlyweightApartmentFactory {
	private HashMap<ApartmentType, Renderable> cache =
			new HashMap<ApartmentType, Renderable>();
	
	public Renderable getObject(ApartmentType type) {
		if(cache.containsKey(type)) {
			return cache.get(type);
		}
		else {
			Renderable r = new FlyweightApartment(type);
			cache.put(type, r);
			return r;
		}
	}
}
