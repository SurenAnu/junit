package org.Hotel_Project;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_Login_Page {
public WebDriver driver;
	@FindBy(xpath = "//*[@id='username']")
	private WebElement login;

	public A_Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbutton() {
		return logbutton;
	}

	@FindBy(xpath = "//*[@id='password']")
	private WebElement pass;

	@FindBy(xpath = "//*[@id='login']")
	private WebElement logbutton;

	@FindBy(css = "//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b/text()[1]")
	private WebElement errornote;

	

	public Object getErrornote() {
		// TODO Auto-generated method stub
		return null;
	}
}
