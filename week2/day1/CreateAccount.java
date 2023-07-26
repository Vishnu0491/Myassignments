package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Official");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Siruseri");
		driver.findElement(By.xpath("//span[@class='tableheadtext']/following::input[@id='annualRevenue']")).sendKeys("30billion$");
		Select Industry = new Select(driver.findElement(By.name("industryEnumId")));
		Industry.selectByIndex(3);
		Select Source = new Select(driver.findElement(By.id("dataSourceId")));
		Source.selectByValue("LEAD_EMPLOYEE");
		Select Ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		Ownership.selectByVisibleText("S-Corporation");
		Select MarketCampaign = new Select(driver.findElement(By.id("marketingCampaignId")));
		MarketCampaign.selectByIndex(6);
		Select State = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		State.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
		driver.switchTo().alert().accept(); // Alert message to click OK
	}

}
