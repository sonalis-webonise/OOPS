
//class power to turn on or off the mobile
public class Power implements Functionality
{
	public Power()
	{
		this.mobilefunction();
		this.buttonPressed(false);
		this.buttonHoldandPressed(true);
	}
	public void mobilefunction() 
	{
		System.out.println("Power");
		//turning on and off of mobile is the functionality of this class
	}
	public void buttonPressed(boolean powerbutton)
	{
		//turn on mobile if already turned off(if true)
	}
	public void buttonHoldandPressed(boolean powerbutton)
	{
		//turn off the mobile(if true)
	}
}
