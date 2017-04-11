package filpkart_project;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Purchase 
{
	WebDriver driver= new FirefoxDriver();
   

	@BeforeMethod
	public void preCond() throws InvalidFormatException, IOException
	
	{

		Excel_Util ex = new Excel_Util();
		String url = ex.readData("BrowserInfo", 1, 1);
		System.out.println(url);	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void postCond()
	{
		driver.close();
	}
	@Test
	public void purchase()
	{
		driver.findElement(By.xpath("//span[text()='Appliances']")).click();
	}

}
