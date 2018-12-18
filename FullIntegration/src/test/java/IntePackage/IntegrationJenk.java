package IntePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntegrationJenk {

	static WebDriver dr;
	@Test(priority=0)
	public static void testHello()
	{
		System.out.println("Welcome to the World of Maven.........");
		System.setProperty("webdriver.chrome.driver", "E:\\Suman\\Softwares\\Cell\\Drivers\\Chrome\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.google.com");
		System.out.println("The page title is : " + dr.getTitle()+" really got it man........????");
	}
	
	@Test(priority=1)
	public static void failingTest() throws Exception
	{
		dr.findElement(By.name("sd")).click();
	}
	
}
