package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String[] args) {
		//declaring driver for chrome
		ChromeDriver driver = new ChromeDriver();
		//load a page
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//close the current window
		driver.close();
		
		EdgeDriver driver1 = new EdgeDriver();
		//load a page
		driver1.get("http://leaftaps.com/opentaps/control/main");
		driver1.manage().window().maximize();
		//get the title of the page
		String title1 = driver1.getTitle();
		System.out.println(title1);
		//close the current window
		driver1.close();
	}

}
