package org.PageModal;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.util.BaseClass;

public class Login_Page {
	
public static WebDriver driver;

	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	


	@FindBy(xpath = "//input[@id='email']")
	private WebElement log;

	public WebElement getLog() {

		return log;
		
	}

	@FindBy(xpath = "//*[@id='pass']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath = "//button[@name='login']")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
