//to set the display settings
//it implements actionListener to perform actions
public class Display implements Functionality {

	public Display() {
		this.mobilefunction();
		this.wallpaper();
		this.time();
		this.widgets();
	}

	public void mobilefunction() {
		System.out.println("Display");
		// Setting the wallpapers and display setting is the functionality of
		// this class
	}

	public void wallpaper() {
		// take image as input and set it as wallpaper
		System.out.println("Wallaper set");
	}

	public void time() {
		// display date and time on home screen
		System.out.println("Date and time");
	}

	public void widgets() {
		// add widgets on the screen
	}
}
