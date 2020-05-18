package ro.ase.acs.chainofresponsibility;

public class CallCenterOperator extends Handler {
	private double refundRequest;
	
	public CallCenterOperator(double refundRequest) {
		this.refundRequest = refundRequest;
	}

	@Override
	public void handle() {
		if(refundRequest < 200) {
			System.out.println("The refund was handled by the call center operator");
		}
		else if(nextHandler != null) {
			nextHandler.handle();
		}
		else {
			System.out.println("The refund cannot be handled");
		}
	}

}
