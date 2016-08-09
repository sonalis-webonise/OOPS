//class callLog to keep the record of calls

public class CallLog implements Functionality {

	public CallLog() {
		this.mobilefunction();
		this.missedcalls();
		this.receivedcalls();
		this.dialedcalls();
	}

	public void mobilefunction() {
		System.out.print("Call log");
		// keeping the record of calls is the functionality of this class
	}

	public void missedcalls() {
		// code to record the list of missed calls
	}

	public void receivedcalls() {
		// code to record the list of received calls
	}

	public void dialedcalls() {
		// code to record the list of dialed calls
	}
}