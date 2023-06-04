package org.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalTime;
import java.util.logging.FileHandler;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	

	public static void urlfb() {
		driver.get("https://www.facebook.com/");
	}
public static void url( String s) {
	driver.get(s);
}
	
	public static void sendKeys(WebElement e, String s) {
		e.sendKeys(s);
	}

	public static String gettitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void jssend(WebElement e) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].value='surendhar'", e);

	}

	public LocalTime currenttime() {
		LocalTime currentTime = LocalTime.now();
		return currentTime;
	}

	public String getattribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}

	public void clk(WebElement e) {
		e.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static void imp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void max() {
		driver.manage().window().maximize();
	}

	public static WebDriver browserlaunch(String browsername) {
		if(browsername.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		}else if(browsername.equals("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(options);
		}else if (browsername.equals("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver=new FirefoxDriver(options);		
		}
		return driver;	
	}
	public static WebDriver browserlaunchprivate(String browsername) {
	switch (browsername) {
	case "chrome":
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		break;
	case "edge":
		EdgeOptions options1 = new EdgeOptions();
		options1.addArguments("--remote-allow-origins=*");
		options1.addArguments("inprivate");
		driver=new EdgeDriver(options1);
	}
	return driver;
	}
	public static String getexcel(String filename, String sheetname, int ro,int ce) throws IOException {
		File f = new File("C:\\Users\\SURENANU\\Desktop\\"+filename+".xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet = book.getSheet(sheetname);
		String value= "";
				Row row = sheet.getRow(ro);
				Cell cell = row.getCell(ce);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					 value = cell.getStringCellValue();
				} 
				else if(cellType.equals(CellType.NUMERIC)){
                       double cellValue = cell.getNumericCellValue();
                       int re =(int) cellValue;
                       value = String.valueOf(re);
                       
				}
				return value;
			}
	public void to(String tourl) {
		driver.navigate().to(tourl);
	}
	
	public void selint(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);
		
		
	}
	public void seltext(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}
	public boolean ismutiple(WebElement e) {
		Select s = new Select(e);
		boolean multiple = s.isMultiple();
return multiple;
	}
	public static void screenshot(String s) throws IOException {
		TakesScreenshot screen=(TakesScreenshot) driver;
		File as = screen.getScreenshotAs(OutputType.FILE);
		File sa = new File("C:\\Users\\SURENANU\\eclipse-workspace\\Junitpro\\snap\\"+s+".png");
		org.openqa.selenium.io.FileHandler.copy(as, sa);
	}
	public static void screenelement(WebElement e,String s) throws IOException {
		
		File as = e.getScreenshotAs(OutputType.FILE);
		File sa = new File("C:\\Users\\SURENANU\\eclipse-workspace\\Junitpro\\snap\\"+s+".png");
		org.openqa.selenium.io.FileHandler.copy(as, sa);
	}
	
	public void jsclk(WebElement e) {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",e);
	}
	
}
