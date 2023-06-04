package org.program;

import org.PageModal.Login_Page;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.util.BaseClass;

@RunWith(Suite.class)
@SuiteClasses({Junitt.class})

public class Run extends BaseClass {
@AfterClass
public static void end() {
	driver.quit();
	System.out.println("anu new code ");
	
}
}
