package org.ele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ele {
public WebDriver driver;


@FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
private WebElement notifi;


public WebElement getNotifi() {
	return notifi;
}
}
