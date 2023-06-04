package org.aa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AA  {
	@Test
	public void start() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.accessibility.com/digital-lawsuits");
	Thread.sleep(8000);
	WebElement findElement = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	JavascriptExecutor executor =(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", findElement);
	Thread.sleep(5000);
	 WebElement findElement2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div[3]/div[1]/div/div/div[1]/h3/a"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", findElement2);
	 findElement2.click();
	 Thread.sleep(5000);
	 WebElement findElement3 = driver.findElement(By.xpath("//input[@name='firstname']"));
	 JavascriptExecutor java =(JavascriptExecutor) driver;
	 java.executeScript("arguments[0].scrollIntoView();", findElement3);
	 findElement3.sendKeys("surendhar");
	
	}
	

}
