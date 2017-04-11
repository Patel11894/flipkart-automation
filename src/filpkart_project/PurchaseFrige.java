package filpkart_project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PurchaseFrige 
{
	
	@Test
	public void purchase() throws InvalidFormatException, IOException
	{
		Excel_Util ex = new Excel_Util();
		String url = ex.readData("BrowserInfo", 1, 1);
		System.out.println(url);	
	    WebDriver driver = new FirefoxDriver();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[text()='Appliances']")).click();
	    driver.findElement(By.xpath("//span[text()='Single Door']")).click();
	    driver.findElement(By.xpath("//div[text()='WDE 205 CLS 3S WINE, Solid Wine, 2017' ]/preceding-sibling::div[text()='Whirlpool 190 L Direct Cool Single Door Refrigerator']")).click();
	    driver.findElement(By.id("pincodeInputId")).sendKeys("560043");
	    driver.findElement(By.xpath("//span[text()='Check']")).click();
	    driver.close();
	   
		
		
		}


}
