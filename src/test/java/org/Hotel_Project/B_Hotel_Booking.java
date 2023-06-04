package org.Hotel_Project;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_Hotel_Booking {
	
	public static WebDriver driver;
	public B_Hotel_Booking(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//*[@id=\"room_type\"]")
	private WebElement roomtype;
	public WebElement getRoomtype() {
		return roomtype;
	}
}
