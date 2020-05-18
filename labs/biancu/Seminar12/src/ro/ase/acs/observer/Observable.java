package ro.ase.acs.observer;

import java.util.List;
import java.util.Vector;

public class Observable {
	private List<Observer> subscribers = new Vector<>();
	
	public void subscribe(Observer observer) {
		subscribers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		subscribers.remove(observer);
	}
	
	protected void notifySubscribers() {
		for(Observer observer : subscribers) {
			observer.notification();
		}
	}
}
