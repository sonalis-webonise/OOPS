
	// Login interface
	/*getData() method is to initialize the username and password to the local variable for further use
	 * verify() method is used to verify the user i.e. the user is registered or not
	 * displayData() method is to navigate to the site or display the page or data after successful login
	 */

public interface login {
	
	public void getData(String un,String pwd);
	public void verify();
	public void displayData();
}
