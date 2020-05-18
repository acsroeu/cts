package ro.ase.acs.observer;

public class ChannelSubcriber implements Observer {
	private String name;
	
	public ChannelSubcriber(String name) {
		this.name = name;
	}

	@Override
	public void notification() {
		System.out.println("The new video was added in the subscription list for " + name);
	}

}
