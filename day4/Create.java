package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("DemosalesManager");
		password.sendKeys("crmsfa");
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("TCS");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Vishnu");
		WebElement lastname = driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Priya");
		WebElement emailid = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailid.sendKeys("priyavishnu234@gmail.com");
		WebElement phonenumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phonenumber.sendKeys("9943932523");
		WebElement createlead = driver.findElement(By.name("submitButton"));
		createlead.click();
		//Edit Java assignment:
		driver.findElement(By.linkText("Edit")).click();
		WebElement companynameupdate = driver.findElement(By.id("updateLeadForm_companyName"));
		companynameupdate.sendKeys("Infosys");
		WebElement updatelead = driver.findElement(By.name("submitButton"));
		updatelead.click();
	}

}
