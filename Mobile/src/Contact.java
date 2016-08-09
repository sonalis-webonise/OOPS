//contacts class to save the contacts

public class Contact implements Functionality {

	public Contact() {
		this.updatecontact("Abcd", 1234);
		this.updatecontact("Abcd", 1234);
		this.deletecontact("pqr");
		this.displaylist();
	}

	public void mobilefunction() {
		System.out.print("Contact");
		// creating, deleting, updating contacts is the functionality of this
		// class
	}

	public void createcontact(String name, Integer number) {
		// create a new contact with given name and number
		System.out.println(name + "  " + number);

	}

	public void updatecontact(String name, Integer number) {
		// modify the number of the person specified in name parameter to new
		// number
		System.out.println(name + "  " + number);
	}

	public void deletecontact(String name) {
		// delete the contact of person specified in name
		System.out.println(name);
	}

	public void displaylist() {
		// display the list of existing all contacts
	}
}
