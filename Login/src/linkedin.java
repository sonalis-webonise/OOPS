
//linkedin class that implements login interface and its methods

public class linkedin implements login
{

	String usr=null,pass=null;
	public void getData(String un,String pwd)
	{
		// username and password is taken from user and initialized here to access those in future
		usr=un;
		pass=pwd;
	}
	public void verify()
	{
		//Verify the user by checking username and password and display message that Login is successful
		System.out.println("User verified");
	}
	public void displayData()
	{
		//If the user is verified then navigate to the site and display contents
		System.out.println(usr + "   " +pass);
	}
	
}
