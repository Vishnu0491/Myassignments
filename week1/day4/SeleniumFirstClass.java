package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\TestLeaf\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.close();
	}

}
