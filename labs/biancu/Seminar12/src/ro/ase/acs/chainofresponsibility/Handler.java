package ro.ase.acs.chainofresponsibility;

public abstract class Handler {
	protected Handler nextHandler;
	
	public void setNextHandler(Handler handler) {
		nextHandler = handler;
	}
	
	public abstract void handle();
}
