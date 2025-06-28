package week1.day2;

public class Browser {
	public String browserName(String browserName){
		System.out.println(browserName + " Browser launched successfully");		
		return browserName;

	}
	public void loadUrl() {
		System.out.println( "Application url loaded successfully");
		
	}

	public static void main(String[] args) {
		Browser web = new Browser();
		web.browserName("firefox");
		web.loadUrl();
	}

}
