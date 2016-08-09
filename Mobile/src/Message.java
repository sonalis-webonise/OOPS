//messages class to keep the records of messages

public class Message implements Functionality {

	public Message() {
		this.mobilefunction();
		this.createnew();
		this.reply("Abc");
		this.forward("Forwarded msg");
		this.messageslist();
	}

	public void mobilefunction() {
		System.out.println("Messages");
		// sending creating messages is the functionality of this class
	}

	public void createnew() {
		// create new message or open the message editor when the create new
		// message button is pressed
		System.out.println("Created");
	}

	public void reply(String name) {
		// reply to the person in name parameter(i.e. open text editor or new
		// message)
		System.out.println("Reply");
	}

	public void forward(String msg) {
		// forward the selected message to people
		// get list of contact from user
	}

	public void messageslist() {
		// display all messages in messages application
	}
}
