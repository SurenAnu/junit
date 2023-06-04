package org.program;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalTime;

import org.PageModal.Login_Page;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.util.BaseClass;

public class Junitt extends BaseClass {
	public static WebDriver driver;
	Login_Page page = new Login_Page(BaseClass.driver);

	@BeforeClass
	public static void start() {
		browserlaunchprivate("edge");
		browserlaunch("edge");
		imp();
		max();
	}
@Ignore
	@AfterClass
	public static void end() {
		// quit();
	}

	@Before
	public void Beforetime() {
		System.out.println(currenttime());
	}

	@After
	public void Aftertime() {
		System.out.println(currenttime());
	}

	@Test
	public void test() throws IOException {
System.out.println("test1");
		sendKeys(page.getLog(), getexcel("facebook", "fb", 1, 1));
		System.out.println(getattribute(page.getLog()));
		Assert.assertNotEquals("username", page.getLog(), getattribute(page.getLog()));
	}

	@Test
	public void test2() throws IOException {
		System.out.println("test2");
		sendKeys(page.getPass(), getexcel("facebook", "fb", 1, 2));
		String getattribute = getattribute(page.getLog());
		boolean contains = getattribute.contains("privacy_mutation_token");
		System.out.println(getattribute(page.getPass()));
	}
@Test
public void test3() throws IOException {
	System.out.println("test3");
	clk(page.getButton());
	to("https://www.facebook.com/");
	sendKeys(page.getLog(), getexcel("facebook", "fb", 2, 1));
	sendKeys(page.getPass(), getexcel("facebook", "fb", 2, 2));
	clk(page.getButton());
}
@Test
public void test4() {
System.err.println(" All test case is excuted ");	
}



}