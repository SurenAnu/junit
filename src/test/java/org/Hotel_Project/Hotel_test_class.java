package org.Hotel_Project;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.util.BaseClass;

public class Hotel_test_class  extends BaseClass{
public static WebDriver driver;
	@BeforeClass
	public static void start() {
		browserlaunchprivate("edge");
		max();
		imp();
		url("https://adactinhotelapp.com/index.php");
	}
	
	
	
	@Test
	public void A_loginpage() throws IOException, InterruptedException {
		A_Login_Page l = new A_Login_Page(BaseClass.driver);
		sendKeys(l.getLogin(), getexcel("facebook", "hotel", 2, 0));
		sendKeys(l.getPass(), getexcel("facebook", "hotel", 2, 1));
		clk(l.getLogbutton());
		String actualtext = getattribute(l.getLogin());
	String expecttext = "";
		Assert.assertEquals("login page ",actualtext ,expecttext );
		sendKeys(l.getLogin(), getexcel("facebook", "hotel", 3, 0));
		sendKeys(l.getPass(), getexcel("facebook", "hotel", 3, 1));
		clk(l.getLogbutton());
		B_Hotel_Booking b = new B_Hotel_Booking(BaseClass.driver); 
		Thread.sleep(2000);		
clk(b.getRoomtype());
screenelement(b.getRoomtype(), "ABC");
screenshot("picture");
	}
	
	
	
	
	
	
	
	
	
	
	
}
