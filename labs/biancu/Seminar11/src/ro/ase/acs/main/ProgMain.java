package ro.ase.acs.main;

import ro.ase.acs.builder.Apartment;
import ro.ase.acs.builder.ApartmentDirector;
import ro.ase.acs.builder.PenthouseBuilder;
import ro.ase.acs.flyweight.ApartmentType;
import ro.ase.acs.flyweight.FlyweightApartment;
import ro.ase.acs.flyweight.FlyweightApartmentFactory;
import ro.ase.acs.flyweight.Renderable;
import ro.ase.acs.proxy.Client;
import ro.ase.acs.proxy.Credit;
import ro.ase.acs.proxy.CreditPrimaCasa;
import ro.ase.acs.proxy.Proxy;

public class ProgMain {
	public static void main(String args[]) {
		//Builder
		ApartmentDirector director =
				new ApartmentDirector(new PenthouseBuilder());
		Apartment ap1 = 
				director.construct(200, 3, 5);
		System.out.println(ap1);
		Apartment ap2 = 
				director.construct(400, 4, 10);
		System.out.println(ap2);
		
		//Flyweight
		FlyweightApartmentFactory factory =
				new FlyweightApartmentFactory();
		for(int i = 0; i < 7; i++) {
			Renderable r1 = factory.getObject(ApartmentType.TwoRooms);
			Renderable r2 = factory.getObject(ApartmentType.ThreeRooms);
			Renderable r3 = factory.getObject(ApartmentType.TwoRooms);
			Renderable r4 = factory.getObject(ApartmentType.ThreeRooms);
			r1.render();
			r2.render();
			r3.render();
			r4.render();
			System.out.println();
		}
		System.out.println(FlyweightApartment.nbOfObjects);
		
		//Proxy
		Client client = new Client("Ion Ionescu", 3000);
		Credit credit = new Proxy(new CreditPrimaCasa(client.getIncome()),
				client);
		System.out.println(client + " " + credit.approved());
		
		Client client2 = new Client("Petre Popescu", 6500);
		Credit credit2 = new Proxy(new CreditPrimaCasa(client2.getIncome()),
				client2);
		System.out.println(client2 + " " + credit2.approved());
	}
}
