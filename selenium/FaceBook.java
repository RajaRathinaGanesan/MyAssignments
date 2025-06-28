package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook {

	public static void main(String[] args) {
		//declaring driver for chrome
		ChromeDriver driver = new ChromeDriver();
		//load a page
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

	}

}