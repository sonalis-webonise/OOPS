import java.io.*;
import java.lang.*;

//LoginPage 

public class LoginPage
{
	public static void main(String[] arg)
	{
		LoginPage obj=new LoginPage();
		String username="Admin";
		String password="admin@123";
		//get username password from user
		/*Either we take input from user and using switch case display the respective site
		or else display all sites methods
		Here I have shown(called) all the sites methods i.e. Facebook Twitter and LinkedIn
		*/
				 
		facebook fb=new facebook();
		fb.getData(username, password);
		fb.verify();
		fb.displayData();
		
		twitter t=new twitter();
		t.getData(username, password);
		t.verify();
		t.displayData();
		
		linkedin l=new linkedin();
		l.getData(username, password);
		l.verify();
		l.displayData();
	}
}
