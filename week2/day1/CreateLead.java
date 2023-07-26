package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyavishnu234@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9943932523");
		Select Source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		Source.selectByValue("LEAD_EMPLOYEE");
		Select Ownership = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		Ownership.selectByVisibleText("Corporation");
		Select Country = new Select(driver.findElement(By.name("generalCountryGeoId")));
		Country.selectByVisibleText("India");
		Select MarketCampaign = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		MarketCampaign.selectByIndex(7);
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
	
	}

}
