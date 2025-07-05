package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on leads
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raja");
		//LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		//click on sourceDD
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		//market campaingn
		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2=new Select(market);
		sel2.selectByVisibleText("Automobile");
		//Corporation
		WebElement industryDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		//get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
