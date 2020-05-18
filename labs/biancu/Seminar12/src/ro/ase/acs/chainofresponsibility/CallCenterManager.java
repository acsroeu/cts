package ro.ase.acs.chainofresponsibility;

public class CallCenterManager extends Handler {
	private double refundRequest;
	
	public CallCenterManager(double refundRequest) {
		this.refundRequest = refundRequest;
	}
	
	@Override
	public void handle() {
		if(refundRequest < 500) {
			System.out.println("The refund was handled by the call center manager");
		}
		else if(nextHandler != null) {
			nextHandler.handle();
		}
		else {
			System.out.println("The refund cannot be handled");
		}
	}

}
