package ro.ase.acs.observer;

public class ChannelSubscriberWithNotification implements Observer {
	private String name;
	
	public ChannelSubscriberWithNotification(String name) {
		this.name = name;
	}

	@Override
	public void notification() {
		System.out.println("User " + name + 
				" received a notification and an email about the new video");
	}
}
