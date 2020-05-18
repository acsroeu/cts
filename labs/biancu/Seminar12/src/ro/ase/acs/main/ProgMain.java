package ro.ase.acs.main;

import ro.ase.acs.chainofresponsibility.CallCenterManager;
import ro.ase.acs.chainofresponsibility.CallCenterOperator;
import ro.ase.acs.chainofresponsibility.SalesManager;
import ro.ase.acs.command.BurgerOrder;
import ro.ase.acs.command.Chef;
import ro.ase.acs.command.PizzaOrder;
import ro.ase.acs.command.PizzaType;
import ro.ase.acs.command.Waiter;
import ro.ase.acs.observer.ChannelSubcriber;
import ro.ase.acs.observer.ChannelSubscriberWithNotification;
import ro.ase.acs.observer.Observer;
import ro.ase.acs.observer.YouTubeChannel;

public class ProgMain {
	public static void main(String[] args) {
		
		//Chain of responsibility
		double price = 700;
		CallCenterOperator operator = new CallCenterOperator(price);
		CallCenterManager callCenterManager = 
				new CallCenterManager(price);
		SalesManager salesManager = new SalesManager();
		operator.setNextHandler(callCenterManager);
		callCenterManager.setNextHandler(salesManager);
		
		operator.handle();
		
		//Command
		Waiter waiter = new Waiter();
		Chef chef = new Chef();
		
		waiter.takeOrder(new PizzaOrder(chef, PizzaType.QuattroStagioni));
		waiter.takeOrder(new BurgerOrder(chef));
		waiter.takeOrder(new PizzaOrder(chef, PizzaType.Salami));
		
		waiter.sendOrders();
		
		//Observer
		YouTubeChannel channel = new YouTubeChannel();
		Observer user = new ChannelSubscriberWithNotification("ABCD");
		channel.subscribe(new ChannelSubcriber("John"));
		channel.subscribe(new ChannelSubcriber("George"));
		channel.subscribe(user);
		channel.subscribe(new ChannelSubscriberWithNotification("XYZ"));
		
		channel.uploadVideo(12345);
		
		channel.unsubscribe(user);
		channel.uploadVideo(3456);
	}
}
